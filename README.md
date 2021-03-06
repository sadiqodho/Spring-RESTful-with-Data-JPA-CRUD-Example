# Spring RESTful with Data JPA CRUD Example
This is an example for beginners who want to learn Spring RESTful services with CRUD example. I have used Data JPA with MySQL database. Here in this project a service where you can retrieve all users, retrieve user by id, add new user and delete user.

## Environment Setup
### Prerequisites
  - Java8 or later
  - Maven
  - IDE (any)
  - MySQL
  
### Steps to setup
 1. Download Source code or clone it using command line
 2. Import source code in any IDE using **maven import**
 3. Update username, password and schema name in **application.properties** file location: src\main\resources\application.properties
 4. Run using command line:
 
 #### Windows:
 ```
 mvnw spring-boot:run
 ```
 
 #### MacOS/Linux:
 ```
 ./mvnw spring-boot:run
 ```

## Dependencies
- Spring Web
- Data JPA
- MySQL connector driver

## RESTful HTTP requests
- **Retrive All Users:** Http method GET: http://localhost:8080/get-users
- **Retrive A User by Id:** http method GET: http://localhost:8080/get-user?id=1
- **Add New User:** http method POST: http://localhost:8080/add-user (form-data)
- **Delete existing User:** http method DELETE: http://localhost:8080/delete-user?id=1

## Cors Configuration for Angular Application
I have added new CorsConfiguration class for allowing Cors Mappings of **"GET"**, **"POST"**, **"DELETE"** methods.

