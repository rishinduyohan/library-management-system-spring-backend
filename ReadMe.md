# Library Management System (Backend)

> A robust RESTful API backend for a Library Management System, built with **Java 25, Spring Boot, and Hibernate (native API)**.  
> Manages book inventory and member registrations with DTOs for safer data handling.

---

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