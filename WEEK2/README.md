# 🌱 Spring Framework Hands-on Projects

## Overview

This repository contains practical implementations of Spring Framework concepts, including **Spring Core**, **Dependency Injection (DI)**, **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL** integration.

The projects were developed to understand the fundamentals of Spring application development, bean management, persistence using JPA, and Maven project configuration.

---

## 📁 Repository Structure

| Project | Description | Stack |
|---------|-------------|-------|
| [LibraryManagement](./LibraryManagement) | Spring Core with XML-based bean configuration | Java 8, Spring 5, Maven |
| [orm-learn](./orm-learn) | Spring Boot + Spring Data JPA with MySQL | Java 17, Spring Boot, Hibernate, MySQL |

---

# 📚 Project 1: LibraryManagement (Spring Core)

### Description

LibraryManagement is a basic Spring Core application that demonstrates **XML-based bean configuration**, **Inversion of Control (IoC)**, **Dependency Injection (DI)**, and **Maven configuration**.

### Features

- XML-based Spring Configuration
- Spring IoC Container
- Setter Dependency Injection
- Bean Configuration
- Maven Build Configuration

### Technologies Used

- Java 8
- Spring Framework 5
- Maven
- IntelliJ IDEA
- XML Configuration

### Project Structure

```
LibraryManagement/
│
├── pom.xml
│
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── library/
    │   │           ├── LibraryManagementApplication.java
    │   │           ├── service/
    │   │           │   └── BookService.java
    │   │           └── repository/
    │   │               └── BookRepository.java
    │   └── resources/
    │       └── applicationContext.xml
```

### Exercises Completed

#### Exercise 1
- Created Maven Project
- Added Spring Context Dependency
- Configured XML Application Context
- Created Service and Repository Beans
- Loaded Spring Context

#### Exercise 2
- Implemented Setter Dependency Injection
- Injected `BookRepository` into `BookService`
- Verified IoC Container

#### Exercise 4
- Configured Maven Project
- Added Spring WebMVC Dependency
- Configured Maven Compiler Plugin

### Output

**Exercise 1:**
```
Book Service Running...
```

**Exercise 2:**
```
Book Service Running...
Displaying books from repository.
```

---

# 🗄️ Project 2: ORM Learn (Spring Boot + Spring Data JPA)

### Description

ORM Learn is a Spring Boot application demonstrating **Object Relational Mapping (ORM)** using Spring Data JPA, Hibernate, and MySQL.

The application retrieves country information from a MySQL database using JPA Repository.

### Features

- Spring Boot Application
- Spring Data JPA
- Hibernate ORM
- MySQL Integration
- Repository Pattern
- Service Layer
- Logging using SLF4J

### Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL 8
- Maven
- IntelliJ IDEA

### Project Structure

```
orm-learn/
│
├── pom.xml
│
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── cognizant/
    │   │           └── ormlearn/
    │   │               ├── OrmLearnApplication.java
    │   │               ├── model/
    │   │               │   └── Country.java
    │   │               ├── repository/
    │   │               │   └── CountryRepository.java
    │   │               └── service/
    │   │                   └── CountryService.java
    │   └── resources/
    │       └── application.properties
```

### Database Setup

**Database Name:** `ormlearn`

**Schema:**
```sql
CREATE TABLE country (
    code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(50)
);
```

**Sample Data:**
```sql
INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');
```

### Modules

| Module | Description |
|--------|-------------|
| **Country Entity** | Represents the `country` table using JPA annotations |
| **Country Repository** | Extends `JpaRepository` for CRUD operations |
| **Country Service** | Business logic for retrieving country records |
| **OrmLearnApplication** | Main class — loads Spring Boot context and fetches all countries |

### Application Output

```
Inside main
Start

Countries = [
  Country{code='IN', name='India'},
  Country{code='US', name='United States of America'}
]

End
```

---

## 📦 Maven Dependencies

### LibraryManagement

- `spring-context`
- `spring-webmvc`
- `spring-aop` *(Optional)*

### ORM Learn

- `spring-boot-starter-data-jpa`
- `mysql-connector-j`
- `spring-boot-devtools`
- `spring-boot-starter-test`

---

## ⚙️ Software Requirements

| Software | Version |
|----------|---------|
| Java JDK | 17 or higher |
| Maven | 3.x |
| IntelliJ IDEA | Any recent version |
| MySQL Server | 8.x |
| MySQL Workbench | Latest |

---

## 🎯 Learning Outcomes

Through these projects, the following concepts were implemented:

- Spring Framework Fundamentals
- Spring IoC Container
- Dependency Injection (Setter-based)
- XML Bean Configuration
- Spring Boot Basics
- Spring Data JPA
- Hibernate ORM
- Repository Pattern
- Service Layer Architecture
- Entity Mapping with JPA Annotations
- MySQL Database Connectivity
- Maven Project Management

---

## 👩‍💻 Author

**Simran Malhi**

B.Tech Computer Science & Engineering — Lovely Professional University

---

## 📄 License

This project is created for **educational and learning purposes**.
