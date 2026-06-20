package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.net.SocketOption;

@Component
public class PaymentService {

    public void pay(){

        System.out.println("Paying...");
    }
    @PostConstruct
    public void beforeInit(){

        System.out.println("Before Paying..");
    }
    @PreDestroy
    public void afterDest(){

        System.out.println("Bean is Destroyed");
    }
}
