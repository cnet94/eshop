-- �������� ������� Company
CREATE TABLE companies (
   company_id SERIAL PRIMARY KEY,
   name VARCHAR(255) NOT NULL,
   balance NUMERIC(10, 2) NOT NULL
);

CREATE TABLE shops (
  shop_id SERIAL PRIMARY KEY,
  company_id INT REFERENCES companies(company_id),
  name VARCHAR(255) NOT NULL,
  address VARCHAR(255) NOT NULL
);

CREATE TABLE public.products
(
    product_id serial,
    shop_id integer REFERENCES shops(company_id),
    category character varying(255) NOT NULL,
    title character varying(255) NOT NULL,
    url_img character varying(255) NOT NULL,
    price numeric(7, 2) NOT NULL,
    description TEXT,
    PRIMARY KEY (product_id)
);

CREATE TABLE public.cat_phones (
    cat_phone_id serial,
    product_id int REFERENCES public.products(product_id),
    brand character varying(100) NOT NULL,
    model character varying(155) NOT NULL,
    system character varying(50) NOT NULL,
    ram int NOT NULL,
    memory int NOT NULL,
    display_size numeric(5, 2) NOT NULL,
    PRIMARY KEY (cat_phone_id)
);

CREATE TABLE public.photos
(
    photo_id serial,
    filename character varying(255) NOT NULL,
    file_path character varying(255) NOT NULL,
    product_id int REFERENCES public.products(product_id),
    PRIMARY KEY (photo_id)
);

CREATE TABLE public.cat_tvs (
    cat_tv_id serial,
    product_id int REFERENCES public.products(product_id),
    diagonal numeric(5, 2) NOT NULL,
    smart_tv boolean,
    PRIMARY KEY (cat_tv_id)
);
