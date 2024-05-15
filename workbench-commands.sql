
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

alter table trainees add team_lead int;



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

INSERT INTO laptops (laptop_name, price,brand) VALUES ('HP Spectre', 250000, 'HP');

INSERT INTO trainees(trainee_name,email,location,laptop_id) values('Shreyash Mahalle','Shreyash@gmail.com','Amravati',8);

insert into laptops (id, laptop_name, price) values (11, 'HP Pavilion', 99000);

insert into trainees (trainee_name, email, location, laptop_id) values ('Sandeep Sharma', 'sandeep@gmail.com', 'Kolkata', 11);

set autocommit=0;

savepoint p1;

delete from trainees;


rollback to p1;

commit;

set autocommit=true;

update trainees set team_lead=12 where team_lead is null;

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

-- order the brands based on their avg price

select brand, avg(price) as 'average price' from laptops group by brand order by 2;




-- DCL - GRANT, REVOKE

-- TCL - COMMIT, ROLLBACK, SAVEPOINT




-- exercises

-- DDL

-- establish a one to many relationship between trainees and laptops without using a third table

-- establish a one to many relationship between trainees and laptops using a third table

-- establish a many to many relationship between trainees and laptops using a third table

-- add a coulmn dob to trainees table

ALTER TABLE trainees ADD dob DATE;

-- DML

-- add values to dob column for all the trainees

update trainees set dob = '2003-01-01' where year(dob)=2023;





-- update data on those mapping tables


-- DQL

-- find the trainees who got laptops from HP

select * from trainees where laptop_id in (select id from laptops where brand='HP');

-- find the trainees who got laptops from HP and price is more than 1 Lakh

-- date realted queries

-- find the trainees who born in 2000

select * from trainees where dob between '2000-01-01' and '2000-12-31';

select * from trainees where extract(year from dob)=2000;

select * from trainees where year(dob)=2000;
 
select * from trainees where dob like '2000%';

-- find the trainees who joined in 2024



-- find the trainees who borned in between 2000 and 2004

select * from trainees where year(dob) between 2000 and 2004;

-- find the trainees who joined in the month of january

-- find the youngest trainee

-- find age of each trainee

select *, floor(datediff(now(),dob)/365) as 'age(years)', mod(dob,365) as 'age(days)' from trainees;



-- find the trainees who borned in the month of january

select * from trainees where extract(month from dob)=1;



-- joins

-- inner join

select t.*, l.* from trainees t INNER join laptops l on t.laptop_id=l.id;

select t.*, l.* from trainees t, laptops l WHERE t.laptop_id=l.id;

-- outer join
-- left join

select t.*, l.* from trainees t left join laptops l on t.laptop_id=l.id;

select t.*, l.* from laptops t right join trainees l on t.laptop_id=l.id;

-- right join
select t.*, l.* from trainees t right join laptops l on t.laptop_id=l.id;

-- find out the unallocated laptops

SELECT l.* FROM laptops l
LEFT JOIN trainees t ON l.id = t.laptop_id
WHERE t.laptop_id is null;

select id from laptops;

select * from laptops where id not in(select laptop_id from trainees where laptop_id is not null);


-- find the trainees with hp laptop

select trainee_name, laptop_name from trainees join laptops on trainees.laptop_id = laptops.id where laptops.brand='HP';


-- find the trainees with laptop price>100000

select trainee_name, laptop_name, price from trainees join laptops on laptop_id = laptops.id where price>=100000;

Select * from trainees where laptop_id  in
(select id from laptops where price > 100000);


-- count the no of trainees for each brand of laptops 

select l.brand, count(l.brand) as no_for_brands from trainees t join laptops l on
t.laptop_id = l.id group by l.brand;

select distinct brand,(select count(t.id) from trainees t where t.laptop_id in 
(select id from laptops where brand=l.brand)) as 'count' from laptops l; 

-- find total trainees who got hp laptop 

select l.brand, count(l.brand) as no_for_brands from trainees t join laptops l on
t.laptop_id = l.id where brand='HP';


-- find the trainee names along with team leads names

select tr.trainee_name, tl.trainee_name from trainees tr join trainees tl on tr.team_lead=tl.id;


-- show the details of the team leads

select distinct tl.trainee_name, tl.id, tl.location from  trainees tr join trainees tl on tr.team_lead=tl.id;

select * from trainees where id in (select team_lead from trainees);

-- show the details of the team leads along with the team size

select tl.trainee_name, tl.id, tl.location, count(*) 
from trainees tr join trainees tl on tr.team_lead=tl.id
group by tl.trainee_name, tl.id;

select distinct tl.trainee_name,(select count(tr.id) 
from trainees tr where tr.team_lead=tl.id) as 'Team Size'
from trainees tl where id in(select team_lead from trainees);


select * from trainees order by id limit 0,2;


-- practice on joins

-- find the trainees who got laptops from HP

select t.id, t.trainee_name, l.laptop_name, l.brand from trainees t join laptops l on t.laptoP_id=l.id where l.brand='HP';

-- find the trainees who got laptops from HP and price is more than 1 Lakh

select t.id, t.trainee_name, l.laptop_name, l.brand, l.price from trainees t join laptops l 
on t.laptoP_id=l.id where l.brand='HP' AND l.price>=100000;



-- find the trainees whith the costliest laptop

select * from trainees t join laptops l on t.laptop_id=l.id order by price desc limit 1;

SELECT trainee_name FROM trainees
WHERE laptop_id = (
        SELECT id
        FROM laptops where id in(select laptop_id from trainees)
        ORDER BY price DESC
        LIMIT 1
);

SELECT *
FROM trainees
WHERE laptop_id IN (
    SELECT id
    FROM laptops
    WHERE price = (
        SELECT MAX(price)
        FROM laptops where id in(select laptop_id from trainees)
    ) 
);


-- find the brand which most number of trainees got

select l.brand,count(brand) as laptop_count from trainees t join laptops l 
on t.laptop_id=l.id group by l.brand order by laptop_count desc limit 1;

SELECT brand
FROM (
    SELECT brand, COUNT(id) AS trainee_count
    FROM laptops
    GROUP BY brand
) AS brand_counts
ORDER BY trainee_count DESC
LIMIT 1;

-- find the trainees who got multiple laptops



-- find the trainees whose team leads are from pune

select tr.trainee_name, tl.trainee_name, tl.location from trainees tr join trainees tl
 on tr.team_lead=tl.id where tl.location='Pune';

-- find the trainees who belong to the same location as their team leads

select tr.trainee_name, tl.trainee_name, tl.location from trainees tr join trainees tl
 on tr.team_lead=tl.id where tl.location=tr.location;

-- find the brands used by diffent team leads

select distinct tl.trainee_name, l.brand
from trainees tl join trainees tr
on tr.team_lead = tl.id
join laptops l on tl.laptop_id=l.id;


-- subqueries

-- find trainees who got hp laptop

-- first find the ids of hp laptops

select id from laptops where brand='HP';

-- find the trainees with laptop_id in the output of the previous query

select trainee_name from trainees where laptop_id in(select id from laptops where brand='HP');

-- creating tables with subquery

create table pune_team as (select * from trainees where location='Pune');

select * from pune_team;

-- select brand, count(*) from laptops where brand in('HP','Apple') group by brand having avg(price)>50000 order by 2 desc;


-- views 

-- create a view with the trainees who got laptops

create view trainees_with_laptop as
select * from trainees where laptop_id is not null;


INSERT INTO trainees_with_laptop(trainee_name,email,location,laptop_id) values('Ludhiya Gurugari','ludhiya@gmail.com','AP',12);


-- create a view to show the details of the team leads along with the team size

create view team_leads_details as 
select tl.trainee_name, tl.id, tl.location, count(*) 
from trainees tr join trainees tl on tr.team_lead=tl.id
group by tl.trainee_name, tl.id;


-- create a view to display the id, trainee_name, dob

create view simplified_trainees as select id, trainee_name, dob from trainees;


-- creating index

select * from trainees where id=12;

create index idx_trainee_name on trainees(trainee_name);

