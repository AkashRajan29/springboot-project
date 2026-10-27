# Spring Boot Mini Projects

A collection of three Java Spring Boot mini projects developed to practice REST API development, CRUD operations, input validation, exception handling, and API testing using Postman.

## 🚀 Projects Overview

This repository contains the following projects:

| No. | Project Name | Key Features |
|---|---|---|
| 1 | Online Food Order System | Food order CRUD operations, validation, and partial updates |
| 2 | Library Book Management System | Book management, search, and availability updates |
| 3 | Student Course Registration System | Student registration, email validation, and student lookup |

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Boot Validation
- Maven
- Postman
- Git and GitHub

## 📁 Repository Structure

```text
springboot-mini-projects/
│
├── 01-food-order-system/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
├── 02-library-book-management/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
├── 03-student-course-registration/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
└── README.md
```

The root `README.md` documents all three projects. The individual project README files shown above are optional; you can remove them if you want only one README in the entire repository.

## 1. Online Food Order System

### Description

A REST API application that allows users to create, retrieve, update, partially update, and delete food orders.

### Features

- Create new food orders
- Retrieve all orders
- Find orders by ID
- Update complete order details
- Partially update order fields
- Delete orders
- Validate customer name, food item, quantity, and price
- Handle errors for missing orders

### API Endpoints

Base URL: `http://localhost:8080/api/orders`

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/orders` | Get all orders |
| GET | `/api/orders/{id}` | Get order by ID |
| POST | `/api/orders` | Create order |
| PUT | `/api/orders/{id}` | Update order |
| PATCH | `/api/orders/{id}` | Partially update order |
| DELETE | `/api/orders/{id}` | Delete order |

### Sample Request

```json
{
  "customerName": "Akash",
  "foodItem": "Chicken Fried Rice",
  "quantity": 2,
  "price": 180.0
}
```

## 2. Library Book Management System

### Description

A REST API application for managing library books, including book details and availability.

### Features

- Add new books
- View all books
- Search books by ID
- Update book details
- Change book availability
- Delete books
- Validate book names, authors, and prices
- Handle missing book records

### API Endpoints

Base URL: `http://localhost:8080/api/books`

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/books` | Get all books |
| GET | `/api/books/{id}` | Find book by ID |
| POST | `/api/books` | Add a book |
| PUT | `/api/books/{id}` | Update book |
| PATCH | `/api/books/{id}/availability?available=false` | Update availability |
| DELETE | `/api/books/{id}` | Delete a book |

### Sample Request

```json
{
  "bookName": "Effective Java",
  "author": "Joshua Bloch",
  "price": 650.0,
  "available": true
}
```

## 3. Student Course Registration System

### Description

A REST API application for registering students for courses and managing student registration records.

### Features

- Register students for courses
- Retrieve all student registrations
- Find students by ID
- Delete registrations
- Validate student names and course names
- Validate email addresses
- Ensure student age is at least 18
- Handle missing student records

### API Endpoints

Base URL: `http://localhost:8080/api/students`

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/students` | Get all registrations |
| GET | `/api/students/{id}` | Find student by ID |
| POST | `/api/students` | Register a student |
| DELETE | `/api/students/{id}` | Delete registration |

### Sample Request

```json
{
  "studentName": "Akash Rajan",
  "courseName": "Spring Boot",
  "email": "akash@example.com",
  "age": 24
}
```

## ▶️ How to Run the Projects

### Prerequisites

- JDK 17 or compatible newer JDK
- Eclipse IDE or Spring Tool Suite
- Maven
- Postman

### Steps

1. Clone or download this repository.
2. Open Eclipse or Spring Tool Suite.
3. Select **File → Import → Maven → Existing Maven Projects**.
4. Import the required project folder.
5. Wait for Maven dependencies to download.
6. Run the corresponding application class.
7. Open Postman and test the REST API endpoints.

Alternatively, open a terminal inside an individual project folder and run:

```bash
mvn spring-boot:run
```

**Important:** All three projects use port `8080` by default. Run one project at a time, or configure different ports before running them simultaneously.

## 🧪 Testing with Postman

For POST and PUT requests:

1. Select the HTTP method.
2. Enter the endpoint URL.
3. Open **Body → raw → JSON**.
4. Enter the appropriate JSON request.
5. Click **Send**.
6. Verify the response body and HTTP status code.

Test valid inputs, invalid inputs, missing IDs, and deletion operations.

## 📚 Learning Outcomes

- Understand Spring Boot application structure.
- Build REST APIs using `@RestController`.
- Implement CRUD operations.
- Use HTTP methods and status codes.
- Validate input using Bean Validation.
- Handle application exceptions.
- Test APIs using Postman.
- Organize and publish Java projects on GitHub.

## 🔮 Future Enhancements

- Integrate MySQL with Spring Data JPA.
- Add database persistence.
- Implement unit and integration tests.
- Improve exception handling.
- Add pagination, sorting, and searching.
- Add Spring Security and authentication.

## 👨‍💻 Author

**Name:** Akash Rajan

**GitHub:** https://github.com/AkashRajan29

---

