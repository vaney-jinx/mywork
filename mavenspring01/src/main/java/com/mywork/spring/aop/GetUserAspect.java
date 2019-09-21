package com.mywork.spring.aop;

import com.mywork.spring.annotation.AddRedis;
import com.mywork.spring.fakerredis.FakerRedis;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

@Aspect
@Component
public class GetUserAspect {
//    //所有getUser方法的前置通知
//    @Before("execution(public * com.mywork.spring.dao.user.*.getUser(..))")
//    public void beforeGetUser(JoinPoint joinPoint){
//        System.out.println(joinPoint.getSignature().getName() + " 前置通知");
//    }
//
//    @AfterReturning(pointcut = "execution(public * com.mywork.spring.dao.user.*.getUser(..))", returning ="returnValue")
//    public void afterGetUser(JoinPoint joinPoint, Object returnValue){
//        System.out.println(joinPoint.getSignature().getName() + " 后置通知，返回值为：" + returnValue);
//    }

    @Around("execution(public * com.mywork.spring.service.*.getUser(..))")
    public Object aroundGetUser(ProceedingJoinPoint proceed) {
        System.out.println(proceed.getSignature().getName() + "环绕通知开始");
        try {
            Object[] params = proceed.getArgs();
            Class[] argClass = new Class[params.length];
            for (int i = 0; i < params.length; i++) {
                argClass[i] = params[i].getClass();
            }
            Method method = proceed.getTarget().getClass().getDeclaredMethod(proceed.getSignature().getName(), argClass);
            AddRedis addRedis = method.getAnnotation(AddRedis.class);
            Object redisV = null;
            String key = null;
            if (Objects.nonNull(addRedis)) {
                key = addRedis.key();
                redisV = FakerRedis.get(key);
            }
            if (Objects.isNull(redisV)) { //如果是空的，从方法中获取
                redisV = proceed.proceed();
                if (Objects.nonNull(key)) {
                    FakerRedis.put(key, redisV);
                }
            }
            return redisV;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println(proceed.getSignature().getName() + "环绕通知结束");
        }
        return null;
    }
}
