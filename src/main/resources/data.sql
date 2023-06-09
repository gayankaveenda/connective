drop table if exists customer;
drop table if exists accounts;

create table `customer` (
    `customer_id` int PRIMARY KEY,
    `name` varchar(100) not null,
    `email` varchar(100) not null,
    `mobile_number` varchar(20) not null,
    `create_dt` date default null
);

create table `accounts` (
    `customer_id` int not null,
    `account_number` int PRIMARY KEY,
    `account_type` varchar(100) not null,
    `branch_address` varchar(200) not null,
    `create_dt` date default null
);

insert into `customer` (customer_id, `name`, email, mobile_number, create_dt)
values (1, 'Easy Bytes', 'tutor@eazybytes.com','987654321', '2020-10-13');

insert into `customer` (customer_id, `name`, email, mobile_number, create_dt)
values (2, 'Drake Dusty', 'dustyd@eazybytes.com','456321245', '2021-12-18');

insert into `accounts` (customer_id, account_number, account_type, branch_address, create_dt)
values (1,1845, 'Savings', '123 Main Street NY', '2022-01-05');

insert into `accounts` (customer_id, account_number, account_type, branch_address, create_dt)
values (2,2745, 'Current', '345 Gippsland Ave Clyde', '2022-04-01');


/*
 SELECT MAX(SALARY) FROM Employee WHERE SALARY < (SELECT MAX(SALARY) FROM Employee);
 */


drop table if exists customer;
drop table if exists accounts;

CREATE TABLE `Employee` (
                          `employee_id` int NOT NULL AUTO_INCREMENT,
                          `Salary` int DEFAULT 0,
                          PRIMARY KEY (`employee_id`)
);

INSERT INTO `Employee` (salary) VALUES(1800);

INSERT INTO `Employee` (salary) VALUES(13000);

INSERT INTO `Employee`(salary)   VALUES(500);

INSERT INTO `Employee` (salary)   VALUES(9000);
INSERT INTO `Employee` (salary)   VALUES(9000);

INSERT INTO `Employee` (salary)  values(25000);
INSERT INTO `Employee` (salary)  values(25000);
INSERT INTO `Employee` (salary)   values(22000);

CREATE TABLE `Logs` (
                      `Id` int NOT NULL AUTO_INCREMENT,
                      `Num` integer DEFAULT 0,
                      PRIMARY KEY (`Id`)
);

INSERT INTO `Logs` (Num)  values(1);
INSERT INTO `Logs` (Num)  values(1);
INSERT INTO `Logs` (Num)  values(1);
INSERT INTO `Logs` (Num)  values(2);
INSERT INTO `Logs` (Num)  values(2);
INSERT INTO `Logs` (Num)  values(3);
INSERT INTO `Logs` (Num)  values(4);
INSERT INTO `Logs` (Num)  values(5);
INSERT INTO `Logs` (Num)  values(3);
INSERT INTO `Logs` (Num)  values(3);

/*
SELECT DISTINCT (Num) as ConsecutiveNums FROM Logs GROUP BY Num having count(Num) > 2 ;
 */
