# 📝 BlogNest

A full-stack web application for bloggers and readers to share, discover, and engage with content. Built with **Spring Boot** for the backend and **Angular** for the frontend, this project empowers users to create insightful blog posts and interact with others’ content through comments.

## 🚀 Project Overview

This platform is designed for:
- 🧠 **Bloggers** who want to share ideas, stories, experiences, or knowledge.
- 👀 **Readers** who enjoy exploring and engaging with interesting content.

Whether you're an aspiring writer or a curious reader, this app creates a space for open discussion and discovery.

## 🛠️ Technologies Used

### Backend - `blogServer`
- Java 17
- Spring Boot (JPA, Web, Validation)
- MySQL (Production) / H2 (Development)
- Lombok
- Maven

### Frontend - `blogWeb`
- Angular
- Angular Material (UI components)
- RxJS & HttpClient for API communication
- SCSS for styling

## 📂 Project Structure

Project/
├── blogServer/ # Spring Boot backend
└── blogWeb/ # Angular frontend


## ✨ Features

### 👥 Authentication
- User registration & login with JWT
- OAuth2 login (Google, GitHub)
- Role-based access

### 📝 Blog System
- Create, view, and delete blog posts
- Comment on posts
- Search posts by author or title
- Like posts

### 📊 Admin Features (optional)
- Manage users and posts
- Monitor activity

## 🧪 Testing
- Unit tests for services, repositories, and mappers (backend)
- Component and service tests (frontend)

## 🔧 How to Run

### Backend
```bash
cd blogServer
./mvnw spring-boot:run

Frontend

cd blogWeb
npm install
ng serve

📄 API Documentation

Access Swagger UI after running the backend:

http://localhost:8080/swagger-ui.html

🧑‍💻 Author

Nurbek — @Nurbek2023
