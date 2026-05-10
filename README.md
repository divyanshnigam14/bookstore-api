# bookstore-api# 📚 Bookstore API (Spring Boot)

## 🚀 Overview

This is a RESTful API built using Spring Boot for managing books.

## 🛠 Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

## 📌 Features

* Create a book
* Get all books
* Get book by ID
* Update book
* Delete book

## 🔗 API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| POST   | /books      | Create book    |
| GET    | /books      | Get all books  |
| GET    | /books/{id} | Get book by ID |
| PUT    | /books/{id} | Update book    |
| DELETE | /books/{id} | Delete book    |

## 🧪 Sample Request (POST)

```json
{
  "title": "Atomic Habits",
  "author": "James Clear",
  "price": 500
}
```

## ▶️ How to Run

1. Clone the repo
2. Open in IDE
3. Configure MySQL in `application.properties`
4. Run the main class
5. Test using Postman

## 📌 Author

Your Name
