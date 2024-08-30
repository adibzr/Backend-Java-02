package com.soyhenry.ej10_2.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
@Scope("prototype") se usa para indicar que un bean debe tener un alcance de prototipo.
Esto significa que una nueva instancia del bean será creada cada vez que se llame al bean.
@Scope("singleton") usa una única instancia del bean compartidan (es el valor predeterminado en Spring).
 */

@Component
//@Scope("prototype")
public class DemoBean implements InitializingBean, DisposableBean {

    @Bean
    public String appInfo(){
        return "App name: Demo Spring " + "\n" + "App version: 1.0.0";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destruyendo Bean!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inicializando Bean!");
    }

    @PostConstruct
    private void customInit(){
        System.out.println("Inicialización personalizada del Bean!");
    }

    @PreDestroy
    private void customDestroy(){
        System.out.println("Destrucción pesonalizada del Bean!");
    }
}
