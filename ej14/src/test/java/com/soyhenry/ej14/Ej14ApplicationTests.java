package com.soyhenry.ej14;

import com.soyhenry.ej14.adapter.BankPayment;
import com.soyhenry.ej14.adapter.adapter.MastercardAdapter;
import com.soyhenry.ej14.adapter.adapter.VisaAdapter;
import com.soyhenry.ej14.adapter.external.MastercarService;
import com.soyhenry.ej14.adapter.external.VisaService;
import com.soyhenry.ej14.builder.Car;
import com.soyhenry.ej14.builder.CarBuilder;
import com.soyhenry.ej14.facade.BankFacade;
import com.soyhenry.ej14.factory.Shape;
import com.soyhenry.ej14.factory.ShapeFactory;
import com.soyhenry.ej14.observer.publisher.NewsPublisher;
import com.soyhenry.ej14.observer.subscriber.EmailSuscriber;
import com.soyhenry.ej14.observer.subscriber.SMSSubscriber;
import com.soyhenry.ej14.proxy.Image;
import com.soyhenry.ej14.proxy.ImageProxy;
import com.soyhenry.ej14.singleton.SingletonExample;
import com.soyhenry.ej14.strategy.CreditCardPayment;
import com.soyhenry.ej14.strategy.PaypalPayment;
import com.soyhenry.ej14.strategy.ShoppingCart;
import com.soyhenry.ej14.decorator.Coffee;
import com.soyhenry.ej14.decorator.SimpleCoffee;
import com.soyhenry.ej14.decorator.MilkDecorator;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Ej14ApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(Ej14ApplicationTests.class);

	@Test
	void contextLoads() {
	}

	@Test
	public void singletonPatternDemoTest(){

		SingletonExample singletonLogger = SingletonExample.getInstance();

		singletonLogger.log("Mensaje de Prueba!");

	}

	@Test
	public void facadeTest(){

		BankFacade bankFacade = new BankFacade();
		bankFacade.makePayment("445321",76424D);
	}

	@Test
	public void strategyPatternDemo(){

		ShoppingCart shoppingCart = new ShoppingCart();

		//Pago con tarjeta de crédito
		shoppingCart.setPaymentStrategy(new CreditCardPayment());
		shoppingCart.makePayment(550.0);

		//Pago con paypal
		shoppingCart.setPaymentStrategy(new PaypalPayment());
		shoppingCart.makePayment(15484.9);
	}

	@Test
	public void builderPatternDemo(){
		Car car = new CarBuilder()
				.setBrand("Ford")
				.setModel("Mustang")
				.setEngine("5.0")
				.setYear(1979)
				.setColor("Grey")
				.build();

		System.out.println(car.toString());

		Car car2 = new CarBuilder()
				.setBrand("Cevrolet")
				.setModel("Corvette")
				.build();

		System.out.println(car2.toString());

		Car car3 = new CarBuilder()
				.setBrand("Volkswagen")
				.build();

		System.out.println(car3.toString());
	}

	@Test
	public void proxyPatternDemo(){
		Image image = new ImageProxy("fotoFamilar.jpg");
		image.display();
		image.display();
	}

	@Test
	public void adapterPatternDemo(){

		BankPayment bankPayment = new BankPayment();

		//Pago con Mastercard
		MastercarService mastercarService = new MastercarService();
		MastercardAdapter mastercardAdapter = new MastercardAdapter(mastercarService, "USD");
		bankPayment.setPaymentProcessorAdapter(mastercardAdapter);
		bankPayment.doPayment(250);

		//Pago con Visa
		VisaService visaService = new VisaService();
		VisaAdapter visaAdapter = new VisaAdapter(visaService,3);
		bankPayment.setPaymentProcessorAdapter(visaAdapter);
		bankPayment.doPayment(45000);
	}

	@Test
	void factoryPatternDemo(){
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circulo1 = shapeFactory.getShape("circle");
		circulo1.draw();

		Shape cuadrado1 = shapeFactory.getShape("square");
		cuadrado1.draw();

		Shape triangulo1 = shapeFactory.getShape("triangle");
		triangulo1.draw();

	}

	@Test
	void observerPatternDemo(){
		NewsPublisher publisher = new NewsPublisher();

		EmailSuscriber subscriber1 = new EmailSuscriber("Sergio");
		EmailSuscriber subscriber2 = new EmailSuscriber("Luis");

		publisher.attach(subscriber1);
		publisher.attach(subscriber2);

		SMSSubscriber subscriber3 = new SMSSubscriber("Maria");
		publisher.attach(subscriber3);

		publisher.publishNews("Hay una actualización de java disponible");

		publisher.detetach(subscriber2);

		publisher.publishNews("Hay una actualización de Windows disponible");
	}

	@Test
	public void decoratorTest(){
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());

		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription() + " $" + coffee.getCost());

	}



	@Test
	public void log() {
		logger.debug("Esto es un mensaje de depuración");
		logger.info("Esto es un mensaje informativo");
		logger.warn("Esto es una advertencia");
		logger.error("Esto es un error");
	}



}
