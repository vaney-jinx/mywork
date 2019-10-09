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

    protected String returnOkWrapper(Object v) {
        JSONObject o = new JSONObject();
        o.put("type", 1);
        o.put("data", v);
        return o.toString();
    }

    protected String returnErrorWrapper(Object v) {
        JSONObject o = new JSONObject();
        o.put("type", 0);
        o.put("data", v);
        return o.toString();
    }
}
