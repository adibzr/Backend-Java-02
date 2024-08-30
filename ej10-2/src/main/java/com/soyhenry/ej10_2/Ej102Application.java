package com.soyhenry.ej10_2;

import com.soyhenry.ej10_2.bean.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Ej102Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej102Application.class, args);

//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Ej102Application.class);
//		DemoBean demoBean = annotationConfigApplicationContext.getBean(DemoBean.class);
//		demoBean.appInfo();
//		annotationConfigApplicationContext.close();
	}

}
