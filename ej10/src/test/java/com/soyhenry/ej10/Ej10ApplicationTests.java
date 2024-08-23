package com.soyhenry.ej10;

import com.soyhenry.ej10.config.BeanExample;
import com.soyhenry.ej10.config.BeanXMLExample;
import com.soyhenry.ej10.config.ComponenExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Spring
@SpringBootApplication: Marca la clase principal de una aplicación Spring Boot.
@Configuration Marca una clase como una clase de configuración de Spring. Se utiliza en lugar de archivos XML
@Bean genera un componente reutilizable que se puede llamar desde cualquier lado de la aplicación.
@Component: Marca una clase como un bean gestionado por Spring.
@Autowired: Inyecta una dependencia gestionada por Spring.
@Service: Es una especialización de @Component que se utiliza para marcar clases que contienen lógica de negocio.
@Repository: Otra especialización de @Component que se usa para clases de acceso a datos.
@Controller / @RestController: Especialización de @Component que se usa para clases que manejan solicitudes HTTP.
@Value Utilizada para inyectar valores desde propiedades o archivos de configuración en campos de una clase.
 */


@SpringBootTest
class Ej10ApplicationTests {

	@Autowired
	ComponenExample componenExample;

	@Autowired
	BeanExample beanExample;


	@Test
	void componentExampleAddNumbers(){
		System.out.println(componenExample.addNumbers(45,8));
	}

	@Test
	void componentExampleSubNumbers(){
		System.out.println(componenExample.subNumbers(45,8));
	}

	@Test
	void beanExampleTest(){
		System.out.println(beanExample.AppInfo());
	}

	@Test
	void beanXMLExampleTest(){

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanXMLExample beanXMLExample = (BeanXMLExample) context.getBean("AppInfoXML");

		System.out.println(beanXMLExample.AppInfoXML());
	}


}
