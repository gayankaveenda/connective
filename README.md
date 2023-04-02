# connective
Repository For Connective Test

Please run build.gradle for test executions
Alternatively, you can run individual classes as well.

Question 1 
Defined via TargetLocator.java and TargetLocatorTests.Java

Question 2
Defined via Container.java and ContainerTests.java


SQL queries can be executed if you Run Connective SpringBoot Application
http://localhost:8080/h2-console can be used to login to in memory DB and execute the queries.
Tables and Queries are automatically populated when you start the Sprint application (data.sql)

SQL Question 1
/*
 SELECT MAX(SALARY) FROM Employee WHERE SALARY < (SELECT MAX(SALARY) FROM Employee);
 */


SQL Question 2
/*
SELECT DISTINCT (Num) as ConsecutiveNums FROM Logs GROUP BY Num having count(Num) > 2 ;
 */
