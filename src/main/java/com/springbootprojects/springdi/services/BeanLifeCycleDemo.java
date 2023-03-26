package com.springbootprojects.springdi.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware
        , ApplicationContextAware, BeanPostProcessor {

    public BeanLifeCycleDemo() {
        System.out.println("##Im in BeanLifecycleDemo constructor##");
    }

    private String javaVer;

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        System.out.println("##1 Properties Set Java Ver: " + this.javaVer);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("## 3 BeanfactoryAware - Bean Factory has been set");

    }

    @Override
    public void setBeanName(String name) {

        System.out.println("##2 BeanNameAware My Bean name is: " + name);

    }


    @Override
    public void destroy() throws Exception {

        System.out.println("## 8 Disposablebean.destroy called- lifecycle bean terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("## 6 afterPrperties Populate properties The Lifecycle bean has its property set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("## 4 Application Context Aware - Application context has been set");


    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("## postProcessBeforeInitialization: " + beanName);

        if (bean instanceof BeanLifeCycleDemo) {
            System.out.println("Calling Before Init");
            BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) bean;
            beanLifeCycleDemo.beforeInit();
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("## postProcessAfterInitialization: " + beanName);

        if (bean instanceof BeanLifeCycleDemo) {
            System.out.println("Calling After Init");
            BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) bean;
            beanLifeCycleDemo.afterInit();
        }

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 5 postConstruct The Post Construct annotation method called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7 The @PreDestroy method called");
    }


    public void beforeInit() {
        System.out.println("##Before Init - Called by Bean Post processor");
    }

    public void afterInit() {
        System.out.println("##After Init - Called by Bean Post processor");
    }
}
