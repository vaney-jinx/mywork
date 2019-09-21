package com.mywork.spring.fakerredis;

import java.util.concurrent.ConcurrentHashMap;

public class FakerRedis {
    private static final ConcurrentHashMap <String, Object> redisMap = new ConcurrentHashMap<>();

    public static void put(String key, Object value){
        System.out.println("存放入redis...");
        redisMap.put(key, value);
    }

    public static Object get(String key){
        System.out.println("从redis获取...");
        return redisMap.get(key);
    }
}
