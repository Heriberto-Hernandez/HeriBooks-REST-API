# HeriBooks-REST-API 📚

A professional RESTful API for library management, developed with Spring Boot. This project focuses on clean architecture, maintainability, and robust security practices.

## 🚀 Key Features

* **Clean Architecture:** Structured using a Layered Pattern (Controller-Service-Repository) to ensure clear separation of concerns.
* **SOLID Principles:** Implemented dependency injection and decoupled components to ensure the code is scalable and easy to test.
* **Secure Authentication:** Integrated **Spring Security** with **BCrypt** password hashing and Role-Based Access Control (RBAC).
* **Data Persistence:** Leveraged **Spring Data JPA** (Hibernate) for automated repository management and relational database integrity.
* **Boilerplate Reduction:** Utilized **Lombok** to streamline code and improve readability.

## 🛠 Tech Stack

* **Java 17+**
* **Spring Boot 3.x**
* **Spring Data JPA (Hibernate)**
* **Spring Security**
* **MySQL Database**
* **Lombok**

## 🏗 Project Structure

The project is organized to facilitate readability and maintainability:

* `controller/`: REST endpoints for handling HTTP requests.
* `service/`: Business logic layer (Business Rules).
* `repository/`: Data access layer interfacing with MySQL.
* `model/`: JPA Entities representing the database schema.
* `security/`: Security configuration, filters, and authentication logic.

## 🚀 Setup & Installation

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/TU_USUARIO/HeriBooks-REST-API.git](https://github.com/TU_USUARIO/HeriBooks-REST-API.git)
