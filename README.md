# Party Hall Reservation System
Java REST API with Spring Boot, developed as a learning project to practice layered architecture, JPA/Hibernate, and REST best practices. Under development — features are being added in stages.

**Implemented so far:**

* Client registration and listing (basic CRUD)
* Persistence via Spring Data JPA with an in-memory H2 database

**In development:**

* Data validation (Bean Validation) and duplicate email blocking
* Error handling with standardized HTTP responses (400, 404, 409)
* Reservation module linked to clients, featuring business rules (no retroactive dates, no double bookings)

**Technologies:** Java, Spring Boot, Spring Web, Spring Data JPA, H2 Database, Lombok, Maven.
