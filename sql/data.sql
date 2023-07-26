INSERT INTO products (shop_id, category, title, url_img, price, description)
VALUES
    (1, 'phones', 'Phone 1', 'https://example.com/img1', 199.99, 'Description 1'),
    (2, 'phones', 'Phone 2', 'https://example.com/img2', 299.99, 'Description 2'),
    (1, 'phones', 'Phone 3', 'https://example.com/img3', 249.99, 'Description 3'),
    (2, 'phones', 'Phone 4', 'https://example.com/img4', 179.99, 'Description 4'),
    (1, 'phones', 'Phone 5', 'https://example.com/img5', 399.99, 'Description 5'),
    (2, 'phones', 'Phone 6', 'https://example.com/img6', 299.99, 'Description 6'),
    (1, 'phones', 'Phone 7', 'https://example.com/img7', 349.99, 'Description 7');


INSERT INTO cat_phones (product_id, brand, model, system, ram, memory, display_size)
VALUES
    (1, 'Brand 1', 'Model 1', 'System 1', 4, 64, 5.5),
    (2, 'Brand 2', 'Model 2', 'System 2', 6, 128, 6.2),
    (3, 'Brand 3', 'Model 3', 'System 3', 8, 256, 6.4),
    (4, 'Brand 4', 'Model 4', 'System 4', 4, 64, 5.8),
    (5, 'Brand 5', 'Model 5', 'System 5', 6, 128, 6.0),
    (6, 'Brand 6', 'Model 6', 'System 6', 8, 256, 6.3),
    (7, 'Brand 7', 'Model 7', 'System 7', 4, 64, 5.7);

INSERT INTO cat_tvs (product_id, diagonal, smart_tv)
VALUES
    (1, 6.2, 'Y'),
    (2, 6.2, 'N'),
    (3, 6.2, 'Y'),
    (4, 6.2, 'N'),
    (5, 6.2, 'Y');

INSERT INTO companies (name, balance) VALUES
    ('Company 1', 1000.00),
    ('Company 2', 2000.00);


INSERT INTO shops (company_id, name, address)
VALUES
    (1, 'Sorso', '��������, �����, ��.����� ������ 60/1'),
    (1, '9Bar', '��������, �����, ��.��������� 12'),
    (2, '���', '��������, �����, ��.������� 55'),
    (2, '������', '��������, �����, ��.�������� 96');

