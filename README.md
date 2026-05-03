Portfolio Manager
Backend-first portfolio management service for creating, storing, and organising software project entries in one place.

Overview
This project provides a Spring Boot backend that powers a portfolio dashboard for managing project data such as name, description, status, technologies, and links. It is designed to showcase backend engineering skills for enterprise Java roles while remaining usable as the backend for a personal developer portfolio site.

Features
POST /dashboard/project endpoint to create project entries.

Stores metadata: name, description, status, backend technologies, tools.

Layered Spring Boot structure (controller, service, repository, model).

Uses ORM-managed schema for quick development with H2 (PostgreSQL planned).

Tech Stack
Layer	Technology
Language	Java
Backend	Spring Boot
Build	Maven
Database	H2 (dev), PostgreSQL (future)
Frontend React (future)
Why this project matters
This project allows me to present my projects on a personal site, demonstrating full-stack capabilities.

Getting started

Prerequisites

Java 17+
Maven
Git

Installation
Clone the repository.

Navigate into the project directory.

Run the application with Maven.

Development notes
At the moment, the project relies on ORM-managed schema generation, which is useful for fast iteration during development. As the application matures, a stronger production-oriented setup would include PostgreSQL, schema migrations, authentication, caching, automated testing, CI/CD, and cloud deployment.

That direction is intentional because the project is also meant to grow into a stronger showcase of enterprise backend skills, especially around Spring Security, PostgreSQL, Docker, GitHub Actions, and testing discipline.

Roadmap
Planned improvements:

Spring Security auth and role-based access.

PostgreSQL, schema migrations, and better validation.

Redis/caching where useful.

JUnit and integration tests (Testcontainers if possible).

Docker, GitHub Actions CI/CD, and cloud deployment (AWS/Azure).

Status
Actively developed as part of a wider backend-first portfolio alongside projects like the Gym Tracker and Friend/Activity Matching apps.
