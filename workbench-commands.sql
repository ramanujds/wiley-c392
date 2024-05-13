
use wiley_db;

select * from trainees;

desc trainees;

-- SQL Commands

-- DDL - CREATE, ALTER, DROP, TRUNCATE

create table trainees(id int primary key auto_increment, trainee_name varchar(50), email varchar(100) not null unique,
location varchar(50));

alter table trainees add email varchar(100);

alter table trainees modify email varchar(100) not null;

drop table trainees;

truncate table trainees;

create table laptops(id int primary key auto_increment, 
    laptop_name varchar(50), price decimal(10,2));
    
alter table trainees add laptop_id int;   

alter table trainees modify laptop_id int unique; 
    
alter table trainees add constraint fk_laptop_id foreign key(laptop_id) references laptops(id);

alter table laptops add brand varchar(20);


-- DML - INSERT, UPDATE, DELETE



insert into laptops(laptop_name,price) values ('Dell XPS 15',150000),('HP X360',120000),('Macbook Pro',200000); 

insert into trainees(trainee_name,email,location,laptop_id) values ('Apeksha Arde','apeksha@yahoo.com','Pune',2);

insert into trainees(trainee_name,email,location) values ('Yuvraj Singh','yuv@yahoo.com','Pune');

update trainees set laptop_id=3 where id=4;
insert into trainees(trainee_name,email,location,laptop_id) values ('Yuvraj Singh','yuv@yahoo.com','Pune',1);
insert into trainees(trainee_name,email,location,laptop_id) values ('Apeksha Arde','apeksha@yahoo.com','Pune',2);
insert into trainees(trainee_name,email,location,laptop_id) values ('Saurajit Sarkar','saurajit@yahoo.com','Kolkata',3);

insert into trainees(trainee_name,email,location) values ('Sravanu N','sravani@yahoo.com','AP'),
														 ('Gaurav Mandal','gaurav@yahoo.com','Hyderabad'),
                                                         ('Patyush Pandit','pratyush@gmail.com','Pandit');
                                                         
update trainees set location='Jamshedpur' where email='pratyush@gmail.com';

update laptops set brand='HP' where laptop_name like 'HP%';
update laptops set brand='Dell' where laptop_name like 'Dell%';
update laptops set brand='Apple' where laptop_name like 'Mac%';

update laptops set brand='Lenovo' where brand is null;

commit;

delete from trainees where id=4;

insert into laptops(laptop_name,price) values ('Dell Latitude 15',130000);

update trainees set laptop_id=4 where trainee_name='Gaurav Mandal';

insert into laptops(laptop_name,price) values ('Lenovo Ideapad',130000);

insert into trainees(trainee_name, email, location,laptop_id) values
 ('Taniya Sethiya', 'taniyas@gmail.com','MP',5);
 
insert into laptops(id,laptop_name,price) values (7,'HP 2222XX', 40000); 
insert into trainees(trainee_name,email,location,laptop_id) values ('Divyansh Kaushik','divyanshkk@gmail.com','Ghaziabad',7);

INSERT INTO laptops (laptop_name, price) VALUES ('Lenovo Gaming', 60000);

INSERT INTO trainees(trainee_name,email,location,laptop_id) values('Shreyash Mahalle','Shreyash@gmail.com','Amravati',8);

insert into laptops (id, laptop_name, price) values (11, 'HP Pavilion', 99000);

insert into trainees (trainee_name, email, location, laptop_id) values ('Sandeep Sharma', 'sandeep@gmail.com', 'Kolkata', 11);

set autocommit=0;

savepoint p1;

delete from trainees;


rollback to p1;

commit;

set autocommit=true;

-- DQL - SELECT

select * from trainees;

select id, trainee_name from trainees;

select * from laptops;

-- find the trainees from pune

select * from trainees where location='Pune';

-- find all the trainees who got laptops

select * from trainees where laptop_id is not null;

-- find all the trainees who did not get laptops

select * from trainees where laptop_id is null;

-- find the laptops with price ranging from 80k to 1.2 Lakhs

select * from laptops where price between 80000 and 120000;

-- find all the laptops with names HP X360, HP Pavilion, HP 2222XX

select * from laptops where laptop_name in ('HP X360','HP Pavilion','HP 2222XX');

-- ordering/sorting

-- arrange laptops incresing order of price

select * from laptops order by price;

-- arrange laptops decresing order of price

select * from laptops order by price desc;

-- find the costliest laptop

SELECT * FROM laptops ORDER BY price DESC LIMIT 1;

-- find the most affordable laptop

SELECT * FROM laptops ORDER BY price LIMIT 1;

-- Group Functions

-- count, avg, sum, min, max

-- find total no of laptops available

select count(*) as 'laptops count' from laptops;

-- average price of laptop

select avg(price) as 'average price' from laptops;

-- average price for each brands of laptops

select brand, avg(price) as Average_Price from laptops group by brand;

-- max price of HP Laptop

select brand, max(price) from laptops group by brand having brand = 'HP';

SELECT brand, MAX(price) AS max_price FROM laptops 
WHERE brand = 'HP' group by brand;


-- Brand with Average price more than 100000

SELECT brand, AVG(price) AS average_price 
FROM laptops 
GROUP BY brand 
HAVING AVG(price) > 100000;

SELECT brand, AVG(price) AS average_price 
FROM laptops 
GROUP BY brand 
HAVING average_price > 100000;


-- DCL - GRANT, REVOKE

-- TCL - COMMIT, ROLLBACK, SAVEPOINT