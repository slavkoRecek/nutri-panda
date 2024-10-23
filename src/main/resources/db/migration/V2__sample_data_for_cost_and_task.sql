
insert into customers(name, email)
values ('john', 'john@mail.com'),
       ('rambo', 'rambo@mail.com');

insert into tasks (id, name, description) values(1, 'Task-1', 'd1');
insert into tasks (id, name, description) values(2, 'Task-2', 'd1');
insert into tasks (id, name, description) values(3, 'Task-3', 'd1');
insert into tasks (id, name, description) values(4, 'Task-4', 'd1');
alter sequence tasks_seq restart with 5;
