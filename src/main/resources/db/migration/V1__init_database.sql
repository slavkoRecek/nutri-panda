create sequence customers_seq start with 1 increment by 50;
create sequence tasks_seq start with 1 increment by 50;

create table customers
(
    id    bigint DEFAULT nextval('customers_seq') not null,
    name  varchar(255)                            not null,
    email varchar(255)                            not null,
    primary key (id)
);

insert into customers(name, email)
values ('john', 'john@mail.com'),
       ('rambo', 'rambo@mail.com');

create table tasks
(
    id    bigint DEFAULT nextval('tasks_seq') not null,
    description varchar(255),
    name        varchar(255),
    primary key (id)
);

