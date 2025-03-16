# 🎯 Quiz Microservices System

## 📝 Overview
This is a **Microservices-based Quiz System** developed using **Spring Boot 3 & Spring Cloud**. It follows **Service-Oriented Architecture (SOA)** with Eureka Service Discovery, Load Balancing, Feign Client for inter-service communication, and an API Gateway.

---

## 🏗️ Architecture
The system consists of the following **microservices**:

1️⃣ **Service Registry (`ServiceRegistry`)**  
   - Uses **Spring Cloud Netflix Eureka Server**.  
   - Registers all microservices.  
   - Runs on **port 8761**.

2️⃣ **Quiz Service (`QuizService`)**  
   - Manages quizzes.  
   - Uses **Spring Data JPA** with **MySQL**.  
   - Communicates with **Question Service** using **Feign Client**.

3️⃣ **Question Service (`QuestionService`)**  
   - Manages quiz questions.  
   - Provides question data to **QuizService** via Feign Client.  

4️⃣ **API Gateway (`ApiGateway`)**  
   - Acts as a single entry point for all services.  
   - Uses **Spring Cloud Gateway** for dynamic routing.  
   - Handles load balancing and service discovery.

---

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot 3**
- **Spring Cloud 2024.0.0**
- **Spring Cloud Netflix Eureka**
- **Spring Cloud Gateway**
- **Spring Data JPA**
- **MySQL**
- **OpenFeign**
- **Load Balancer**
- **Maven**

---

## 🔌 Service Ports
| Service            | Port  |
|--------------------|------|
| Service Registry  | 8761 |
| API Gateway       | 8080 |
| Quiz Service      | 8081 |
| Question Service  | 8082 |



