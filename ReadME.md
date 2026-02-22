# Capgemini LPU Advanced Java

A comprehensive learning repository showcasing advanced Java concepts and enterprise technologies covered in the Capgemini LPU  Advanced Java program.

## 📚 Project Overview

This repository contains practical implementations and examples of core advanced Java topics, database connectivity, and object-relational mapping frameworks essential for enterprise Java development.

## 🛠️ Technologies Used

### Core Framework
- **Hibernate ORM** - Object-relational mapping framework for Java database applications
- **JDBC** - Java Database Connectivity for direct database access and manipulation

### Database
- SQL database integration with Hibernate and JDBC implementations
- Transaction management and connection pooling

### Testing & Mocking
- **Mockito** - Mocking framework for unit testing Java applications
- Comprehensive test coverage practices

### Java Fundamentals
- Advanced Java 8+ features
- Object-oriented programming principles
- Design patterns and best practices

## 📁 Project Structure

The repository is organized into focused modules covering different aspects of Java development:

### Database Connectivity
- **`basicsofjdbc/`** - Fundamentals of JDBC and database operations
- **`learnjdbc/`** - Practical JDBC implementations and patterns

### Hibernate ORM
- **`basic_hibernate/`** - Introduction to Hibernate framework
- **`hibernate_basics/`** - Core Hibernate concepts and configuration
- **`product_hibernate/`** - Real-world Hibernate application example

### Object Relational Mappings
- **`onetoonemapping/`** - One-to-One relationship mappings
- **`onetoonebidirectionalmapping/`** - Bidirectional One-to-One relationships
- **`onetomany/`** - One-to-Many relationship mappings
- **`manytooneprac/`** - Many-to-One relationship practice
- **`manytomany/`** - Many-to-Many relationship mappings
- **`manytomanybidirectional/`** - Bidirectional Many-to-Many relationships

### Advanced Features
- **`cache_practice/`** - Hibernate caching strategies and implementation
- **`mockito/`**, **`mockitoPrac/`**, **`pracmockito/`** - Unit testing with Mockito framework

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Maven or Gradle (build tool)
- Relational database (MySQL, PostgreSQL, H2, etc.)
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/hariprasanth-jcode/capgemini_lpu_advance_java.git
   cd capgemini_lpu_advance_java
   ```

2. **Configure Database Connection**
   - Update database properties in Hibernate configuration files
   - Set connection credentials for your chosen database

3. **Build the Project**
   ```bash
   mvn clean install
   # or with Gradle
   gradle build
   ```

4. **Run Examples**
   - Navigate to specific module directories
   - Execute individual example classes or test suites

## 📖 Key Topics Covered

### JDBC
- Connection management
- Statement execution
- ResultSet processing
- Transaction handling

### Hibernate ORM
- Entity mapping and configuration
- CRUD operations
- Relationship mapping (One-to-One, One-to-Many, Many-to-Many)
- Lazy vs Eager loading strategies
- Query API (HQL, Criteria API, Native SQL)
- Caching mechanisms (First-level and Second-level cache)

### Unit Testing
- Test-driven development (TDD)
- Mock object creation and configuration
- Behavior verification
- Stub implementations

## 🔗 Related Topics

- Java Enterprise Edition (Java EE) concepts
- Spring Framework integration (often used with Hibernate)
- Microservices architecture
- RESTful API development

## 📝 Learning Outcomes

After exploring this repository, you will understand:
- How to establish and manage database connections using JDBC
- How to map Java objects to database tables using Hibernate
- How to design and implement complex object relationships
- How to optimize database queries and performance
- How to write testable code with proper mocking strategies
- Enterprise Java development best practices

