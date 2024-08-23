package com.soyhenry.ej10.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


public class BeanXMLExample {
    public String AppInfoXML(){
        return "App Name XML:" + "Demo Spring" + "\n" + "App Version: 1.0.0";
    }
}
