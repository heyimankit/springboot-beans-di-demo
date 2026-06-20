# Spring Boot Beans & Dependency Injection Demo

A beginner-friendly Spring Boot project demonstrating the core concepts of Spring Framework including Bean Management, Dependency Injection, Qualifiers, and Bean Lifecycle.

## Overview

This project was created to understand how Spring Boot manages objects (Beans) using the IoC (Inversion of Control) Container and how dependencies are injected automatically.

## Concepts Covered

* Spring IoC Container
* Bean Creation using `@Bean`
* Configuration using `@Configuration`
* Dependency Injection
* Constructor Injection
* Interface-based Design
* Multiple Bean Implementations
* Bean Selection using `@Qualifier`
* Bean Lifecycle Management

  * `@PostConstruct`
  * `@PreDestroy`

## Project Structure

### NotificationService

Interface defining notification-related operations.

### EmailNotificationService

Implementation of notification service using Email.

### SmsNotificationService

Implementation of notification service using SMS.

### PaymentService

Demonstrates dependency injection by consuming NotificationService.

### AppConfig

Spring Configuration class responsible for Bean definitions.

### DemoApplication

Application entry point.

## Technologies Used

* Java 17
* Spring Boot
* Maven

## Learning Outcomes

Through this project, I learned:

* How Spring manages application objects as Beans
* How Dependency Injection reduces tight coupling
* How to work with multiple Bean implementations
* How `@Qualifier` resolves Bean ambiguity
* How Bean lifecycle callbacks work
* Basic Spring Boot project structure and configuration

## Getting Started

### Clone Repository

```bash
git clone https://github.com/heyimankit/springboot-beans-di-demo.git
```

### Run Application

```bash
mvn spring-boot:run
```

## Author

Ankit Shaw
