# Week 4 Projects

This folder contains two Spring Boot projects created during Week 4.

## Account

* Located in `WEEK4/account`
* A simple Spring Boot application for handling account details.
* Main class: `com.cognizant.account.AccountApplication`
* Includes controller and model packages.

## Loan

* Located in `WEEK4/loan`
* A simple Spring Boot application for handling loan details.
* Main class: `com.cognizant.loan.LoanApplication`
* Includes controller and model packages.

## How to Run

1. Open the project (`account` or `loan`) in your IDE or terminal.

2. Go to the project folder.

3. Run the application using:

   * Windows:

     ```
     mvnw.cmd spring-boot:run
     ```

   * Linux/macOS:

     ```
     ./mvnw spring-boot:run
     ```

4. Open your browser or Postman and test the API using the configured port.

## Technologies Used

* Java 17
* Spring Boot
* Maven

## Note

Both projects are independent microservices and have their own `pom.xml` file.
