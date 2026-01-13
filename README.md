# JPA Hibernate Fundamentals

This project was created to practice and demonstrate the fundamental concepts of **JPA (Java Persistence API)** using **Hibernate** as the persistence provider, with **Maven** for dependency management.

## 📌 Project Overview

The goal of this project is to provide a simple and clean example of:
- Creating a JPA entity
- Configuring `persistence.xml`
- Using `EntityManager`
- Persisting data into a MySQL database

It is intentionally small and focused on fundamentals.

---

### 🛠 Technologies Used

- Java
- Maven
- JPA (javax.persistence)
- Hibernate
- MySQL
- IntelliJ IDEA

---

### 🧩 Entity

The project contains a simple `Person` entity with the following attributes:
- `id`
- `name`
- `email`

The entity is annotated using standard JPA annotations.

---

### ⚙️ Persistence Configuration

The JPA configuration is defined in:

src/main/resources/META-INF/persistence.xml


Hibernate is configured with:
- MySQL dialect
- `hbm2ddl.auto=update`
- JDBC properties using **system properties** (no credentials hardcoded)

Example:
```xml
<property name="javax.persistence.jdbc.user" value="${DB_USER}" />
<property name="javax.persistence.jdbc.password" value="${DB_PASSWORD}" />
```
---

### ▶️ How to Run

Make sure you have a MySQL database created.

Set the required system properties (DB_USER and DB_PASSWORD) via VM options or environment variables.

Run the Program class.

The program will create and persist a Person object in the database.

### 🔐 Security Note

Database credentials are not hardcoded and are excluded from version control.
IDE-specific files and build artifacts are ignored via .gitignore.

### 🎯 Purpose

This project is for learning purposes and focuses on understanding how JPA and Hibernate work together in a simple Maven project.
