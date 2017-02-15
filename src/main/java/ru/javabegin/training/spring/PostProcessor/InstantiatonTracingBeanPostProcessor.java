package ru.javabegin.training.spring.PostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by vbokh on 15.02.2017.
 */
public class InstantiatonTracingBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        System.out.println("Starting initializing bean : " + bean.toString());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        System.out.println("Bean " + s + " is created. " + bean.toString());
        return bean;
    }
}
