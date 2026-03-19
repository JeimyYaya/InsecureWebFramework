# Lambda Web Framework

## 📌 Overview

This project implements a lightweight Java web framework built from scratch using raw sockets.  
It enhances a basic HTTP server and transforms it into a framework capable of:

- Defining REST services using lambda expressions
- Extracting query parameters from HTTP requests
- Serving static files from configurable locations
- Structuring applications with a clean separation of concerns

The goal of this project is to deepen understanding of:

- HTTP protocol architecture
- Client-server communication
- TCP sockets
- Web application design
- Distributed systems fundamentals

---

## 🏗 Architecture

The framework is organized into the following components:

### Core Framework

- **HttpServer** – Handles TCP connections and HTTP parsing.
- **Request** – Encapsulates HTTP request data and query parameters.
- **Response** – Encapsulates HTTP response metadata.
- **Router** – Manages REST endpoint mappings.
- **StaticFileHandler** – Serves static files from the configured directory.
- **WebApp** – Public API for developers to register routes and configure static files.

### Application Layer

- **App** – Example web application demonstrating framework usage.

---

## 🚀 How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/webframework.git
cd webframework
```

2️⃣ Compile the project
mvn clean package
3️⃣ Run the application
mvn exec:java -Dexec.mainClass="com.ejemplo.app.App"

The server will start on:

http://localhost:8080
🌐 Available Endpoints
REST Endpoints
http://localhost:8080/hello?name=Pedro

Response:

Hello Pedro
http://localhost:8080/pi

Response:

3.141592653589793
Static Files
http://localhost:8080/index.html

Static files are served from:

src/main/resources/webroot
🧪 Automated Tests

The project includes automated unit tests using JUnit 5.

To run tests:
mvn test

Test coverage includes:

Query parameter extraction

Route registration and execution

Static file loading

Framework API integration

Successful execution will show:

BUILD SUCCESS
📦 Maven Structure

The project follows standard Maven structure:

src/
 ├── main/
 │   ├── java/
 │   └── resources/
 └── test/
     └── java/

The repository does NOT include:

target/

IDE configuration files

Unnecessary artifacts

🎯 Design Decisions

Uses raw ServerSocket to understand HTTP at low level.

Separates routing logic from networking logic.

Encapsulates request data for cleaner lambda handling.

Static files are resolved using the classpath (target/classes).

Framework exposes a minimal API via WebApp.

🏁 Outcome

This project demonstrates:

Manual implementation of an HTTP server

REST routing with lambda functions

Static file management

Clean modular architecture

Automated testing

It provides hands-on understanding of web server internals and distributed system design principles.

👩‍💻 Author

Developed as part of the Web Framework Development project.