# Spring Boot CRUD Application — Student Management


Module: Software Engineering
Name:H.D.S Dinuki
Registration No:245024G


## Description
A Spring Boot REST API built with Maven that performs CRUD operations on a Student entity, using Spring Data JPA and an H2 in-memory database.

## Endpoints
| Method | Endpoint | Description |
|--------|----------|--------------|
| POST | /api/students | Create a student |
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| PUT | /api/students/{id} | Update student by ID |
| DELETE | /api/students/{id} | Delete student by ID |

## How to run
1. Clone this repository
2. Run `./mvnw spring-boot:run`
3. App runs on http://localhost:8080

## Maven commands used
- `mvn clean` — removes target directory
- `mvn compile` — compiles source code
- `mvn test` — runs tests
- `mvn package` — builds JAR
- `mvn install` — installs to local repo
- `mvn spring-boot:run` — runs the app