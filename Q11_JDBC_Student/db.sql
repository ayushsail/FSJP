CREATE DATABASE IF NOT EXISTS fsjp_db;

USE fsjp_db;

CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT,
    course VARCHAR(100)
);

DESCRIBE students;

SELECT * FROM students;



-- to display 
USE fsjp_db;

SELECT * FROM students;