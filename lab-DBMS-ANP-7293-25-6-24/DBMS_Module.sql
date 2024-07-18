
									/*  Module ---> DBMS Lab  */
                                    
/*Q1. Create a Table For Employee as mention in Sql Question  Documents.
and apply the queries on same table.  

Employee Tables

emp_id | emp_name | job_name  | manager_id | hire_date  | salary  | commission | dep_id
--------+----------+-----------+------------+------------+---------+------------+--------
  68319 | KAYLING  | PRESIDENT |            | 1991-11-18 | 6000.00 |            |   1001
  66928 | BLAZE    | MANAGER   |      68319 | 1991-05-01 | 2750.00 |            |   3001
  67832 | CLARE    | MANAGER   |      68319 | 1991-06-09 | 2550.00 |            |   1001
  65646 | JONAS    | MANAGER   |      68319 | 1991-04-02 | 2957.00 |            |   2001
  67858 | SCARLET  | ANALYST   |      65646 | 1997-04-19 | 3100.00 |            |   2001
  69062 | FRANK    | ANALYST   |      65646 | 1991-12-03 | 3100.00 |            |   2001
  63679 | SANDRINE | CLERK     |      69062 | 1990-12-18 |  900.00 |            |   2001
  64989 | ADELYN   | SALESMAN  |      66928 | 1991-02-20 | 1700.00 |     400.00 |   3001
  65271 | WADE     | SALESMAN  |      66928 | 1991-02-22 | 1350.00 |     600.00 |   3001
  66564 | MADDEN   | SALESMAN  |      66928 | 1991-09-28 | 1350.00 |    1500.00 |   3001
  68454 | TUCKER   | SALESMAN  |      66928 | 1991-09-08 | 1600.00 |       0.00 |   3001
  68736 | ADNRES   | CLERK     |      67858 | 1997-05-23 | 1200.00 |            |   2001
  69000 | JULIUS   | CLERK     |      66928 | 1991-12-03 | 1050.00 |            |   3001
  69324 | MARKER   | CLERK     |      67832 | 1992-01-23 | 1400.00 |            |   1001

*/

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    job_name VARCHAR(50),
    manager_id INT,
    hire_date DATE,
    salary DECIMAL(10, 2),
    commission DECIMAL(10, 2),
    dep_id INT
);

INSERT INTO Employee (emp_id, emp_name, job_name, manager_id, hire_date, salary, commission, dep_id) VALUES
(68319, 'KAYLING', 'PRESIDENT', NULL, '1991-11-18', 6000.00, NULL, 1001),
(66928, 'BLAZE', 'MANAGER', 68319, '1991-05-01', 2750.00, NULL, 3001),
(67832, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, NULL, 1001),
(65646, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, NULL, 2001),
(67858, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, NULL, 2001),
(69062, 'FRANK', 'ANALYST', 65646, '1991-12-03', 3100.00, NULL, 2001),
(63679, 'SANDRINE', 'CLERK', 69062, '1990-12-18', 900.00, NULL, 2001),
(64989, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00, 3001),
(65271, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00, 3001),
(66564, 'MADDEN', 'SALESMAN', 66928, '1991-09-28', 1350.00, 1500.00, 3001),
(68454, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, 0.00, 3001),
(68736, 'ADNRES', 'CLERK', 67858, '1997-05-23', 1200.00, NULL, 2001),
(69000, 'JULIUS', 'CLERK', 66928, '1991-12-03', 1050.00, NULL, 3001),
(69324, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, NULL, 1001);


/* 1.	From the following table return complete information about the employees.   */

SELECT * FROM Employee;

/* 2.	 From the following table, write a SQL query to find the salaries of all employees. Return salary.  */

SELECT salary FROM Employee;

/* 3.	 From the following table, write a SQL query to find the unique designations of the employees. Return job name.  */

SELECT DISTINCT job_name FROM Employee;

/* 4.	From the following table, write a SQL query to list the employees’ name, increased their salary by 15%, and expressed as number of Dollars. */

SELECT emp_name, salary * 1.15 AS increased_salary FROM Employee;

/* 5.	 From the following table, write a SQL query to list the employee's name and job name as a format of "Employee & Job". */
SELECT CONCAT(emp_name, ' & ', job_name) AS Employee_Job FROM Employee;

/* 6.	Write a query in SQL to produce the output of employees as follows.   
Employee */
SELECT emp_name AS Employee FROM Employee;

/* 7.	From the following table, write a SQL query to find those employees with hire date in the format like February 22, 1991. Return employee ID, employee name, salary, hire date.    */

SELECT emp_id, emp_name, salary, DATE_FORMAT(hire_date, '%M %d, %Y') AS hire_date FROM Employee;

/* 8.	From the following table, write a SQL query to count the number of characters except the spaces for each employee name. Return employee name length.  */

SELECT emp_name, LENGTH(REPLACE(emp_name, ' ', '')) AS name_length FROM Employee;

/* 9.	From the following table, write a SQL query to find the employee ID, salary, and commission of all the employees.   */

SELECT emp_id, salary, commission FROM Employee;

/* 10.	From the following table, write a SQL query to find the unique department with jobs. Return department ID, Job name.   */

SELECT DISTINCT dep_id, job_name FROM Employee;

/* 11.	From the following table, write a SQL query to find those employees who do not belong to the department 2001. Return complete information about the employees.   */

SELECT * FROM Employee WHERE dep_id != 2001;

/* 12.	From the following table, write a SQL query to find those employees who joined before 1991. Return complete information about the employees.  */

SELECT * FROM Employee WHERE hire_date < '1991-01-01';

/* 13.	From the following table, write a SQL query to calculate the average salary of employees who work as analysts. Return average salary.  */

SELECT AVG(salary) AS avg_salary FROM Employee WHERE job_name = 'ANALYST';

/* 14.	From the following table, write a SQL query to find the details of the employee ‘BLAZE’.   */

SELECT * FROM Employee WHERE emp_name = 'BLAZE';

/* 15.	From the following table, write a SQL query to identify employees whose commissions exceed their salaries. Return complete information about the employees.   */

SELECT * FROM Employee WHERE salary * 1.25 > 3000;

/* 16.	From the following table, write a SQL query to identify those employees whose salaries exceed 3000 after receiving a 25% salary increase. Return complete information about the employees.   */

SELECT * FROM Employee WHERE salary * 1.25 > 3000;

/* 17.	 From the following table, write a SQL query to find the names of the employees whose length is six. Return employee name.   */

SELECT emp_name FROM Employee WHERE LENGTH(emp_name) = 6;

/* 18.	From the following table, write a SQL query to find out which employees joined in the month of January. Return complete information about the employees.  */

SELECT * FROM Employee WHERE MONTH(hire_date) = 1;

/* 19.	From the following table, write a SQL query to separate the names of employees and their managers by the string 'works for'. */

SELECT emp_name || ' works for ' || manager_id AS Employee_Manager FROM Employee;

/* 20.	From the following table, write a SQL query to find those employees whose designation is ‘CLERK’. Return complete information about the employees.  */

SELECT * FROM Employee WHERE job_name = 'CLERK';


/* Q2 Create a Table For Salesman as mention in Sql  Questions Documents.
Order Tables   apply the queries on same table.  

Employee Tables

emp_id | emp_name | job_name  | manager_id | hire_date  | salary  | commission | dep_id
--------+----------+-----------+------------+------------+---------+------------+--------
  68319 | KAYLING  | PRESIDENT |            | 1991-11-18 | 6000.00 |            |   1001
  66928 | BLAZE    | MANAGER   |      68319 | 1991-05-01 | 2750.00 |            |   3001
  67832 | CLARE    | MANAGER   |      68319 | 1991-06-09 | 2550.00 |            |   1001
  65646 | JONAS    | MANAGER   |      68319 | 1991-04-02 | 2957.00 |            |   2001
  67858 | SCARLET  | ANALYST   |      65646 | 1997-04-19 | 3100.00 |            |   2001
  69062 | FRANK    | ANALYST   |      65646 | 1991-12-03 | 3100.00 |            |   2001
  63679 | SANDRINE | CLERK     |      69062 | 1990-12-18 |  900.00 |            |   2001
  64989 | ADELYN   | SALESMAN  |      66928 | 1991-02-20 | 1700.00 |     400.00 |   3001
  65271 | WADE     | SALESMAN  |      66928 | 1991-02-22 | 1350.00 |     600.00 |   3001
  66564 | MADDEN   | SALESMAN  |      66928 | 1991-09-28 | 1350.00 |    1500.00 |   3001
  68454 | TUCKER   | SALESMAN  |      66928 | 1991-09-08 | 1600.00 |       0.00 |   3001
  68736 | ADNRES   | CLERK     |      67858 | 1997-05-23 | 1200.00 |            |   2001
  69000 | JULIUS   | CLERK     |      66928 | 1991-12-03 | 1050.00 |            |   3001
  69324 | MARKER   | CLERK     |      67832 | 1992-01-23 | 1400.00 |            |   1001

*/

CREATE TABLE `Order` (
    ord_no INT PRIMARY KEY,
    purch_amt DECIMAL(10, 2),
    ord_date DATE,
    customer_id INT,
    salesman_id INT
);

INSERT INTO `Order` (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES
(70001, 150.5, '2012-10-05', 3005, 5002),
(70009, 270.65, '2012-09-10', 3001, 5005),
(70002, 65.26, '2012-10-05', 3002, 5001),
(70004, 110.5, '2012-08-17', 3009, 5003),
(70007, 948.5, '2012-09-10', 3005, 5002),
(70005, 2400.6, '2012-07-27', 3007, 5001),
(70008, 5760, '2012-09-10', 3002, 5001),
(70010, 1983.43, '2012-10-10', 3004, 5006),
(70003, 2480.4, '2012-10-10', 3009, 5003),
(70012, 250.45, '2012-06-27', 3008, 5002),
(70011, 75.29, '2012-08-17', 3003, 5007),
(70013, 3045.6, '2012-04-25', 3002, 5001);

/* 1.	From the following table, write a SQL query to calculate total purchase amount of all orders. Return total purchase amount. */

SELECT SUM(purch_amt) AS total_purchase_amount FROM `Order`;

/* 2.	From the following table, write a SQL query to calculate the average purchase amount of all orders. Return average purchase amount. */

SELECT AVG(purch_amt) AS average_purchase_amount FROM `Order`;

/* 3.	From the following table, write a SQL query that counts the number of unique salespeople. Return number of salespeople.  */

SELECT COUNT(DISTINCT salesman_id) AS number_of_salespeople FROM `Order`;

/* 4.	 From the following table, write a SQL query to count the number of customers. Return number of customers. */

SELECT COUNT(DISTINCT customer_id) AS number_of_customers FROM `Order`;

/* 5.	 From the following table, write a SQL query to find the maximum purchase amount. */

SELECT MAX(purch_amt) AS max_purchase_amount FROM `Order`;

/* 6.	From the following table, write a SQL query to find the minimum purchase amount. */

SELECT MIN(purch_amt) AS min_purchase_amount FROM `Order`;



/* Q3 Create a Table For order as mention in Sql  Questions  Documents.
and apply the queries on same table. 

Salesman Table
salesman_id |    name    |   city   | commission 
-------------+------------+----------+------------
        5001 | James Hoog | New York |       0.15
        5002 | Nail Knite | Paris    |       0.13
        5005 | Pit Alex   | London   |       0.11
        5006 | Mc Lyon    | Paris    |       0.14
        5007 | Paul Adam  | Rome     |       0.13
        5003 | Lauson Hen | San Jose |       0.12

 */

CREATE TABLE Salesman (
    salesman_id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50),
    commission DECIMAL(10, 2)
);

INSERT INTO Salesman (salesman_id, name, city, commission) VALUES
(5001, 'James Hoog', 'New York', 0.15),
(5002, 'Nail Knite', 'Paris', 0.13),
(5005, 'Pit Alex', 'London', 0.11),
(5006, 'Mc Lyon', 'Paris', 0.14),
(5007, 'Paul Adam', 'Rome', 0.13),
(5003, 'Lauson Hen', 'San Jose', 0.12);



/* 1.	From the following table, write a SQL query to find the details of those salespeople who come from the 'Paris' City or 'Rome' City. Return salesman_id, name, city, commission. */

SELECT salesman_id, name, city, commission FROM Salesman WHERE city IN ('Paris', 'Rome');

/* 2.	 From the following table, write a SQL query to find the details of the salespeople who come from either 'Paris' or 'Rome'. Return salesman_id, name, city, commission.   */

SELECT salesman_id, name, city, commission FROM Salesman WHERE city IN ('Paris', 'Rome');

/* 3.	 From the following table, write a SQL query to find the details of those salespeople who live in cities other than Paris and Rome. Return salesman_id, name, city, commission.  */

SELECT salesman_id, name, city, commission FROM Salesman WHERE city NOT IN ('Paris', 'Rome');

/* 4.	 From the following table, write a SQL query to retrieve the details of all customers whose ID belongs to any of the values 3007, 3008 or 3009. Return customer_id, cust_name, city, grade, and salesman_id.  */

SELECT customer_id, cust_name, city, grade, salesman_id FROM Customer WHERE customer_id IN (3007, 3008, 3009);

/* 5.	From the following table, write a SQL query to find salespeople who receive commissions between 0.12 and 0.14 (begin and end values are included). Return salesman_id, name, city, and commission. */

SELECT salesman_id, name, city, commission FROM Salesman WHERE commission BETWEEN 0.12 AND 0.14;

/* 6.	 From the following table, write a SQL query to retrieve the details of the salespeople whose names begin with any letter between 'A' and 'L' (not inclusive). Return salesman_id, name, city, commission.  */

SELECT salesman_id, name, city, commission FROM Salesman WHERE name REGEXP '^[A-L].*';
