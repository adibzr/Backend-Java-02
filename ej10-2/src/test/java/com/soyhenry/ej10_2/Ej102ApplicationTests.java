package com.soyhenry.ej10_2;

import com.soyhenry.ej10_2.bean.DemoBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Ej102ApplicationTests {


	@Autowired
	DemoBean demoBean;

	
	@Test
	void beanExampleTest(){
		System.out.println(demoBean.appInfo());
	}



}
