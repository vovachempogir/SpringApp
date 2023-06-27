package com.example.spring_transport;

import com.example.spring_transport.model.AppConfig;
import com.example.spring_transport.model.Driver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringTransportApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		context.getBean("driver1", Driver.class).start();
		context.getBean("driver2", Driver.class).start();
		context.getBean("driver3", Driver.class).start();
	}
}
