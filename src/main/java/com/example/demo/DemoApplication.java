package com.example.demo;

import com.example.demo.impl.EmailNotificationService;
import com.example.demo.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

//	@Autowired
//	PaymentService paymentServiceObj; //field type Dependency Injection(DI)

//	final NotificationService notificationServiceObj;
//	public DemoApplication(NotificationService notificationServiceObj){
//		this.notificationServiceObj=notificationServiceObj; // constructor type DI (Preferred)
//	}
	@Autowired
	Map<String, NotificationService> notificationServiceMap = new HashMap<>();


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		paymentServiceObj.pay();
//		notificationServiceObj.send("hello");

		for (var notificationService : notificationServiceMap.entrySet()) {
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}
	}
}
