# Library Management System (Backend)

> A robust RESTful API backend for a Library Management System, built with **Java 25, Spring Boot, and Hibernate (native API)**.  
> Manages book inventory and member registrations with DTOs for safer data handling.

---

<div align="center">
<!-- Badges -->
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Java-25-orange%3Fstyle%3Dflat-square%26logo%3Dopenjdk%26logoColor%3Dwhite" alt="Java 25" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Spring%2520Boot-Web-green%3Fstyle%3Dflat-square%26logo%3Dspringboot%26logoColor%3Dwhite" alt="Spring Boot" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Hibernate-Native-blue%3Fstyle%3Dflat-square%26logo%3Dhibernate%26logoColor%3Dwhite" alt="Hibernate" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Build-Maven-C71A36%3Fstyle%3Dflat-square%26logo%3Dapachemaven%26logoColor%3Dwhite" alt="Maven" />
</div>

## 🚀 Features

<table align="center">
<tr>
<td width="50%" valign="top">
<h3 align="center">📖 Book Management</h3>
<ul>
<li><strong>Full Lifecycle:</strong> Add new books and update details.</li>
<li><strong>Retrieval:</strong> List all books or fetch by unique ID.</li>
<li><strong>Inventory:</strong> Complete management of library stock.</li>
</ul>
</td>
<td width="50%" valign="top">
<h3 align="center">👤 Member Management</h3>
<ul>
<li><strong>Registration:</strong> Register new members efficiently.</li>
<li><strong>Profiles:</strong> Update member information on the fly.</li>
<li><strong>Search:</strong> Retrieve member details by ID.</li>
</ul>
</td>
</tr>
</table>

## 🛠 Technology Stack

- **Language:** Java 25
- **Framework:** Spring Boot (Web)
- **Persistence:** Hibernate (native API + `hibernate.cfg.xml`)
- **Build:** Maven
- **DB:** MySQL (or any JDBC-compatible DB; update connection URL accordingly)

---

## 📁 Project Structure
```xml
 src/main/java/edu/icet/ecom

├── config # HibernateUtil (SessionFactory setup)
├── controller # BookController, MemberController (API Endpoints)
├── model
│ ├── dto # Data Transfer Objects
│ └── entity # Database Entities (BookEntity, MemberEntity)
├── repository # DAO Interfaces
│ └── impl # Hibernate Implementations (Session/Transaction logic)
├── service # Business logic interfaces
│ └── impl # Service implementations
└── Main.java # Application entry point

```
---

## 🔌 API Endpoints

Base path for books: `/api/library/books`  
Base path for members: `/api/library/members`

### Books

| Method | Endpoint        | Description              | Request Body |
|--------|-----------------|--------------------------|--------------|
| GET    | `/all`          | Retrieve all books       | —            |
| GET    | `/{id}`         | Get book by ID           | —            |
| POST   | `/add`          | Add a new book           | `BookEntity` |
| POST   | `/update`       | Update book details      | `BookEntity` |

### Members

| Method | Endpoint        | Description              | Request Body   |
|--------|-----------------|--------------------------|----------------|
| GET    | `/all`          | Retrieve all members     | —              |
| GET    | `/{id}`         | Get member by ID         | —              |
| POST   | `/add`          | Register a member        | `MemberEntity` |
| POST   | `/update`       | Update member info       | `MemberEntity` |

---

## ⚙ Configuration (`hibernate.cfg.xml`)

Place `hibernate.cfg.xml` under `src/main/resources/` and update DB credentials:

```xml
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="connection.url">jdbc:mysql://localhost:3306/your_db_name</property>
    <property name="connection.username">your_username</property>
    <property name="connection.password">your_password</property>

    <!-- Optional -->
    <property name="show_sql">true</property>
    <property name="hbm2ddl.auto">update</property>

  </session-factory>
</hibernate-configuration>
```