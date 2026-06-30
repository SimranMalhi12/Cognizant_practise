<div align="center">

# 🚀 Mandatory Hands-On Exercises

### A comprehensive collection of Java programming exercises covering core software engineering concepts

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.3-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![JUnit5](https://img.shields.io/badge/JUnit-5.10-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Mockito](https://img.shields.io/badge/Mockito-5.11-78A641?style=for-the-badge)](https://site.mockito.org/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)

---

*Built with ❤️ as part of mandatory hands-on training exercises*

</div>

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Project Structure](#-project-structure)
- [Modules](#-modules)
  - [1. JUnit Testing](#1--junit-testing)
  - [2. Logging with Log4j2](#2--logging-with-log4j2)
  - [3. Mockito – Mocking & Stubbing](#3--mockito--mocking--stubbing)
  - [4. Design Patterns](#4--design-patterns)
  - [5. Data Structures & Algorithms](#5--data-structures--algorithms)
  - [6. PL/SQL Exercises](#6--plsql-exercises)
- [Tech Stack](#-tech-stack)
- [Prerequisites](#-prerequisites)
- [Getting Started](#-getting-started)
- [How to Run](#-how-to-run)
- [Author](#-author)
- [License](#-license)

---

## 🌟 Overview

This repository contains **6 hands-on modules** demonstrating essential software engineering concepts in Java. Each module is a self-contained Maven project covering a specific topic — from unit testing and logging to design patterns, data structures, and database programming.

---

## 📁 Project Structure

```
Mandatory_handon/
│
├── JUnit/
│   └── SettingUpJUnit/              # JUnit 5 unit testing basics
│
├── LoggingExample/                  # Log4j2 logging with Spring Boot
│
├── Mockito/
│   └── MockingAndStubbing/          # Mockito mocking & stubbing
│
├── design_pattern/
│   ├── FactoryMethodPatternExample/ # Factory Method design pattern
│   └── SingletonPatternExample/     # Singleton design pattern
│
├── dsa/
│   ├── EcommerceSearchFunction/     # Binary Search implementation
│   └── FinancialForecasting/        # Recursive financial forecasting
│
├── SLF4J/                           # SLF4J logging (placeholder)
│
├── pl-sql/                          # PL/SQL exercise screenshots
│
└── README.md
```

---

## 📦 Modules

### 1. 🧪 JUnit Testing

> **Path:** `JUnit/SettingUpJUnit/`

Demonstrates setting up and writing basic unit tests using **JUnit 5**.

| Class | Description |
|-------|-------------|
| `Calculator.java` | Simple calculator with `add()` and `subtract()` methods |
| `CalculatorTest.java` | Unit tests using `@Test` and `assertEquals` assertions |

**Key Concepts:**
- JUnit 5 test lifecycle
- `@Test` annotation
- `assertEquals` assertions
- Maven Surefire plugin integration

```java
@Test
void testAdd() {
    assertEquals(5, calculator.add(2, 3));
}
```

---

### 2. 📝 Logging with Log4j2

> **Path:** `LoggingExample/`

A **Spring Boot** application demonstrating logging at all severity levels using **Apache Log4j2**.

| Class | Description |
|-------|-------------|
| `LoggingExampleApplication.java` | Spring Boot application entry point |
| `LoggingRunner.java` | `CommandLineRunner` that logs at TRACE, DEBUG, INFO, WARN, ERROR, and FATAL levels |

**Key Concepts:**
- Log4j2 integration with Spring Boot
- Log severity levels hierarchy
- `LogManager.getLogger()` usage
- Configurable log output

```java
logger.info("This is an INFO message");
logger.warn("This is a WARN message");
logger.error("This is an ERROR message");
```

---

### 3. 🎭 Mockito – Mocking & Stubbing

> **Path:** `Mockito/MockingAndStubbing/`

Demonstrates **mocking** and **stubbing** techniques using the Mockito framework for isolated unit testing.

| Class | Description |
|-------|-------------|
| `UserRepository.java` | Interface defining `findUsernameById(String id)` |
| `UserService.java` | Service layer returning username or `"Unknown User"` |
| `UserServiceTest.java` | Tests using `@Mock`, `@InjectMocks`, `when().thenReturn()`, and `verify()` |

**Key Concepts:**
- `@Mock` and `@InjectMocks` annotations
- Stubbing with `when(...).thenReturn(...)`
- Verifying interactions with `verify()`
- Test isolation via dependency mocking

```java
@Mock
private UserRepository userRepository;

@Test
void testGetUsername() {
    when(userRepository.findUsernameById("1")).thenReturn("Alice");
    assertEquals("Alice", userService.getUsername("1"));
    verify(userRepository).findUsernameById("1");
}
```

---

### 4. 🏗️ Design Patterns

#### 4a. Factory Method Pattern

> **Path:** `design_pattern/FactoryMethodPatternExample/`

Implements the **Factory Method** creational design pattern for creating shape objects.

| Class | Description |
|-------|-------------|
| `Shape.java` | Interface with `draw()` method |
| `Circle.java` | Concrete circle implementation |
| `Square.java` | Concrete square implementation |
| `ShapeFactory.java` | Factory class with `getShape(String type)` |
| `FactoryPatternDemo.java` | Client demonstrating factory usage |

```
┌─────────────┐     creates     ┌───────────┐
│ ShapeFactory │ ──────────────► │  «Shape»  │
└─────────────┘                 └───────────┘
                                  ▲       ▲
                                  │       │
                            ┌─────┘       └─────┐
                        ┌───────┐           ┌────────┐
                        │Circle │           │ Square │
                        └───────┘           └────────┘
```

#### 4b. Singleton Pattern

> **Path:** `design_pattern/SingletonPatternExample/`

Implements the **Singleton** creational design pattern for a database connection manager.

| Class | Description |
|-------|-------------|
| `DatabaseConnection.java` | Singleton with private constructor and `getInstance()` |
| `SingletonPatternDemo.java` | Proves both references point to the same instance |

**Key Concepts:**
- Private static instance
- Private constructor
- Thread-safe lazy initialization
- `getInstance()` global access point

---

### 5. 📊 Data Structures & Algorithms

#### 5a. E-Commerce Search (Binary Search)

> **Path:** `dsa/EcommerceSearchFunction/`

Implements a **product search system** for an e-commerce platform using **Binary Search** on sorted data.

| Class | Description |
|-------|-------------|
| `Product.java` | Product model with `productId`, `productName`, `category`, `price` |
| `ProductSearchService.java` | Binary search by name, filter by category & price range |
| `ProductSearchApp.java` | Demo application with sample product catalog |

**Key Concepts:**
- Binary Search algorithm — `O(log n)` time complexity
- Data filtering and range queries
- Sorted data prerequisite for binary search

#### 5b. Financial Forecasting (Recursion)

> **Path:** `dsa/FinancialForecasting/`

Implements **financial future value forecasting** using a **recursive algorithm**.

| Class | Description |
|-------|-------------|
| `FinancialForecaster.java` | Recursive `calculateFutureValue(presentValue, growthRate, periods)` |
| `FinancialForecastingApp.java` | Forecasts $1,000 at 5% growth over 10 periods |

**Formula:**

$$FV = PV \times (1 + r)^n$$

**Key Concepts:**
- Recursion with base case (`periods == 0`)
- Compound growth calculation
- Time complexity: `O(n)` where `n` = number of periods

---

### 6. 🗃️ PL/SQL Exercises

> **Path:** `pl-sql/`

Contains **screenshot evidence** of PL/SQL programming exercises executed in an Oracle database environment. The screenshots document hands-on work with PL/SQL procedures, functions, and queries.

---

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 17 | Core programming language |
| **Maven** | 3.9+ | Build automation & dependency management |
| **Spring Boot** | 3.5.3 | Application framework (Logging module) |
| **JUnit 5** | 5.10.2 | Unit testing framework |
| **Mockito** | 5.11.0 | Mocking framework for unit tests |
| **Log4j2** | 2.24.3 | Logging framework |
| **PL/SQL** | — | Oracle database programming |

---

## ✅ Prerequisites

Before running the projects, ensure you have the following installed:

- **Java JDK 17** or higher → [Download](https://adoptium.net/)
- **Apache Maven 3.9+** → [Download](https://maven.apache.org/download.cgi)
- **Git** → [Download](https://git-scm.com/downloads)
- An IDE such as **IntelliJ IDEA** (recommended) or **Eclipse**

Verify your installations:

```bash
java -version
mvn -version
git --version
```

---

## 🚀 Getting Started

**1. Clone the repository:**

```bash
git clone https://github.com/SimranMalhi12/Cognizant_practise.git
cd Cognizant_practise
```

**2. Navigate to any module and build:**

```bash
cd JUnit/SettingUpJUnit
mvn clean install
```

---

## ▶️ How to Run

Each module is an independent Maven project. Navigate to the desired module and use the appropriate command:

### Run Tests (JUnit / Mockito)

```bash
# JUnit Tests
cd JUnit/SettingUpJUnit
mvn test

# Mockito Tests
cd Mockito/MockingAndStubbing
mvn test
```

### Run Applications

```bash
# Logging Example (Spring Boot)
cd LoggingExample
mvn spring-boot:run

# Factory Method Pattern
cd design_pattern/FactoryMethodPatternExample
mvn compile exec:java -Dexec.mainClass="com.example.factorymethodpatternexample.FactoryPatternDemo"

# Singleton Pattern
cd design_pattern/SingletonPatternExample
mvn compile exec:java -Dexec.mainClass="com.example.singletonpatternexample.SingletonPatternDemo"

# E-Commerce Search
cd dsa/EcommerceSearchFunction
mvn compile exec:java -Dexec.mainClass="com.example.ecommercesearchfunction.ProductSearchApp"

# Financial Forecasting
cd dsa/FinancialForecasting
mvn compile exec:java -Dexec.mainClass="com.example.financialforecasting.FinancialForecastingApp"
```

---

## 👤 Author

**Simran**

- 📧 Email: [simranmalhi1612@gmail.com](mailto:simranmalhi1612@gmail.com)
- GitHub: [@SimranMalhi12](https://github.com/SimranMalhi12)

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

<div align="center">

⭐ **Star this repository if you found it helpful!** ⭐

</div>
