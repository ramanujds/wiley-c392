
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


-- DML - INSERT, UPDATE, DELETE



insert into laptops(laptop_name,price) values ('Dell XPS 15',150000),('HP X360',120000),('Macbook Pro',200000); 

insert into trainees(trainee_name,email,location,laptop_id) values ('Apeksha Arde','apeksha@yahoo.com','Pune',2);

insert into trainees(trainee_name,email,location) values ('Yuvraj Singh','yuv@yahoo.com','Pune');

update trainees set laptop_id=3 where id=4;
insert into trainees(trainee_name,email,location,laptop_id) values ('Yuvraj Singh','yuv@yahoo.com','Pune',1);
insert into trainees(trainee_name,email,location,laptop_id) values ('Apeksha Arde','apeksha@yahoo.com','Pune',2);
insert into trainees(trainee_name,email,location,laptop_id) values ('Saurajit Sarkar','saurajit@yahoo.com','Kolkata',3);

commit;

delete from trainees where id=4;



set autocommit=0;

savepoint p1;

delete from trainees;


rollback to p1;

commit;

set autocommit=true;

-- DQL - SELECT

select * from trainees;

select * from laptops;



-- DCL - GRANT, REVOKE

-- TCL - COMMIT, ROLLBACK, SAVEPOINT