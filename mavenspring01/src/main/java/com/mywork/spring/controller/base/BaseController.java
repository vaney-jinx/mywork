package com.mywork.spring.controller.base;

import net.sf.json.JSONObject;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BaseController implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    protected <T> T getBean(String beanName) {
        return (T) context.getBean(beanName);
    }

    protected JSONObject getJsonData(String data) {
        return JSONObject.fromObject(data);
    }

    protected String returnOkWrapper(String v) {
        return "{\"type\": 1, \"data\": \"" + v + "\"}";
    }

    protected String returnErrorWrapper(String v) {
        return "{\"type\": 0, \"data\": \"" + v + "\"}";
    }
}
