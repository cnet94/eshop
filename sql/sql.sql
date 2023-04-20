CREATE DATABASE food777
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE TABLE public.products
(
    product_id serial,
    title character varying NOT NULL,
    prots numeric(6, 2),
    fats numeric(6, 2),
    carbos numeric(6, 2),
    kcal integer,
    weight integer,
    PRIMARY KEY (product_id)
);

ALTER TABLE IF EXISTS public.products
    OWNER to postgres;

INSERT INTO products (title, prots, fats, carbos, kcal, weight)
VALUES ('Абрикос свежий', 1.2, 0.2, 14.5, 56, 100),
       ('Греческий йогурт', 6.0, 10.0, 4.0, 150, 100),
       ('Красная рыба', 20.0, 10.0, 0.0, 200, 100),
       ('Овсяные хлопья', 11.0, 7.0, 65.0, 379, 100),
       ('Салат Цезарь', 6.0, 9.0, 8.0, 135, 100),
       ('Черешня сушеная', 2.0, 1.0, 70.0, 320, 100),
       ('Говядина низкой жирности', 26.0, 3.0, 0.0, 130, 100),
       ('Манго сушеное', 2.5, 0.5, 73.0, 325, 100),
       ('Курица гриль', 23.0, 5.0, 0.0, 140, 100),
       ('Кукурузные хлопья', 7.0, 1.0, 85.0, 379, 100);
