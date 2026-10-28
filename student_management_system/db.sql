```sql
-- Create database
CREATE DATABASE IF NOT EXISTS student_management;

-- Select database
USE student_management;

-- Create students table
CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);

-- Display all student records
SELECT * FROM students;
```