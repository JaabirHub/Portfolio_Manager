Portfolio Manager
A backend-first portfolio management application for creating, storing, and managing software project entries in one place. The project is designed as the foundation for a personalised developer portfolio where each project can include descriptions, status, technology tags, GitHub links, and live demo links.

Overview
Portfolio Manager is built to solve a practical problem: keeping software projects organised and presentation-ready instead of scattered across repositories, notes, and unfinished portfolio pages. It provides a Spring Boot backend that can power a dashboard for managing project data and, over time, a polished frontend experience for showcasing work to recruiters and employers.

This repository currently focuses on the backend and reflects a backend-first engineering approach using Java and Spring Boot, which aligns with a broader goal of targeting enterprise backend roles while still remaining open to full-stack opportunities.

Features
Create project entries through a dashboard endpoint.

Store core project metadata such as name, description, status, backend technologies, and tools.

Use Spring Boot to structure controllers, services, and persistence logic in a clean backend architecture.

Use ORM-managed schema creation during development to move quickly without maintaining manual migration files yet.

Provide a base that can later be extended with authentication, role-based access, PostgreSQL, caching, CI/CD, and deployment improvements.

Tech Stack
Layer	Technology
Language	Java
Backend framework	Spring Boot
Build tool	Maven
Database	H2 currently, with PostgreSQL as a natural next step
Frontend direction	Intended to support a personalised portfolio frontend
Why this project matters
This project allows me to present my projects on a personal site, demonstrating full-stack capabilities.

Project structure
text
src/
├── main/
│   ├── java/
│   │   └── ...
│   │       ├── controller/
│   │       ├── service/
│   │       ├── model/
│   │       └── repository/
│   └── resources/
└── test/
The codebase follows a typical Spring Boot layered structure so that request handling, business logic, and persistence concerns remain separated and easier to maintain as the project grows.

Getting started
Prerequisites
Java 17+

Maven

Git

Installation
Clone the repository.

Navigate into the project directory.

Run the application with Maven.

bash
git clone https://github.com/JaabirHub/Portfolio_Manager
cd backend
./mvnw spring-boot:run
If the project does not include the Maven wrapper, use:

bash
mvn spring-boot:run
Development notes
At the moment, the project relies on ORM-managed schema generation, which is useful for fast iteration during development. As the application matures, a stronger production-oriented setup would include PostgreSQL, schema migrations, authentication, caching, automated testing, CI/CD, and cloud deployment.

That direction is intentional because the project is also meant to grow into a stronger showcase of enterprise backend skills, especially around Spring Security, PostgreSQL, Docker, GitHub Actions, and testing discipline.

Roadmap
Planned improvements include:

Add Spring Security authentication and authorization.

Move from H2 to PostgreSQL for a more production-like data layer.

Add validation, exception handling, and cleaner API responses.

Introduce Redis or basic caching where it makes sense.

Add JUnit and integration tests, with Testcontainers as a stretch goal.

Add Docker support and CI/CD using GitHub Actions.

Deploy the application using AWS or Azure as part of a production-style workflow.

Example use cases
Maintain a single source of truth for all personal and team software projects.

Power a portfolio dashboard where projects can be created and updated without editing static files manually.

Present software work in a more structured and recruiter-friendly way through a future frontend integration.

Status
This project is actively being developed as part of a larger push to strengthen backend and full-stack portfolio work before September 2026.
