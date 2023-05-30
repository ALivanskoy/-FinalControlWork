
# Заходим в MySQL и создаём БД "Друзья человека" внутри вашего репозитория с помощью команды 

CREATE DATABASE human_friends;

# Чтобы создать таблицы "Одомашненные животные", "Вьючные животные", "Домашние животные", "кони", "ослы", "верблюды", "собаки", "кошки", "хомяки" с соответствующими полями, выполните следующие SQL-запросы:


Таблица "Одомашненные животные":
CREATE TABLE pets (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    PRIMARY KEY (name)
);

Таблица "Вьючные животные":
CREATE TABLE pack_animals (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    carrying_capacity INT(11) NOT NULL,
    PRIMARY KEY (name)
);

Таблица "Домашние животные":
CREATE TABLE domesticated_animals (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    fluffy BOOLEAN NOT NULL,
    PRIMARY KEY (name)
);

Таблица "кони":
CREATE TABLE horses (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    carrying_capacity INT(11) NOT NULL,
    PRIMARY KEY (name)
);

Таблица "ослы":
CREATE TABLE donkeys (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    carrying_capacity INT(11) NOT NULL,
    PRIMARY KEY (name)
);

Таблица "верблюды":
CREATE TABLE camels (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    carrying_capacity INT(11) NOT NULL,
    PRIMARY KEY (name)
);

Таблица "собаки":
CREATE TABLE dogs (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    fluffy BOOLEAN NOT NULL,
    PRIMARY KEY (name)
);

Таблица "кошки":
CREATE TABLE cats (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    fluffy BOOLEAN NOT NULL,
    PRIMARY KEY (name)
);

Таблица "хомяки":
CREATE TABLE hamsters (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    fluffy BOOLEAN NOT NULL,
    PRIMARY KEY (name)
);

# Чтобы заполнить таблицы "кони", "ослы", "верблюды", "собаки", "кошки", "хомяки" данными, выполните следующие SQL-запросы:

Заполнение таблицы "кони":
INSERT INTO horses (name, birthdate, carrying_capacity)
VALUES 
    ('Лошадь 1', '2015-01-01', 200),
    ('Лошадь 2', '2014-02-02', 250),
    ('Лошадь 3', '2013-03-03', 300),
    ('Лошадь 4', '2012-04-04', 350),
    ('Лошадь 5', '2011-05-05', 400);

Заполнение таблицы "ослы":
INSERT INTO donkeys (name, birthdate, carrying_capacity)
VALUES 
    ('Осел 1', '2015-01-01', 100),
    ('Осел 2', '2014-02-02', 150),
    ('Осел 3', '2013-03-03', 200),
    ('Осел 4', '2012-04-04', 250),
    ('Осел 5', '2011-05-05', 300);

Заполнение таблицы "верблюды":
INSERT INTO camels (name, birthdate, carrying_capacity)
VALUES 
    ('Верблюд 1', '2015-01-01', 500),
    ('Верблюд 2', '2014-02-02', 550),
    ('Верблюд 3', '2013-03-03', 600),
    ('Верблюд 4', '2012-04-04', 650),
    ('Верблюд 5', '2011-05-05', 700);

Заполнение таблицы "собаки":
INSERT INTO dogs (name, birthdate, fluffy)
VALUES 
    ('Собака 1', '2015-01-01', 1),
    ('Собака 2', '2014-02-02', 0),
    ('Собака 3', '2013-03-03', 1),
    ('Собака 4', '2012-04-04', 0),
    ('Собака 5', '2011-05-05', 1);

Заполнение таблицы "кошки":
INSERT INTO cats (name, birthdate, fluffy)
VALUES 
    ('Кошка 1', '2015-01-01', 1),
    ('Кошка 2', '2014-02-02', 0),
    ('Кошка 3', '2013-03-03', 1),
    ('Кошка 4', '2012-04-04', 0),
    ('Кошка 5', '2011-05-05', 1);

Заполнение таблицы "хомяки":
INSERT INTO hamsters (name, birthdate, fluffy)
VALUES 
    ('Хомяк 1', '2015-01-01', 1),
    ('Хомяк 2', '2014-02-02', 0),
    ('Хомяк 3', '2013-03-03', 1),
    ('Хомяк 4', '2012-04-04', 0),
    ('Хомяк 5', '2011-05-05', 1);

# Чтобы удалить таблицу "верблюды", выполните следующий SQL-запрос:

DROP TABLE camels;

# Чтобы создать таблицу "молодые животные" и добавить в нее животных старше 1 года, но младше 3 лет, а также подсчитать возраст животных в отдельном столбце с точностью до месяца, выполните следующие SQL-запросы:

Создание таблицы "молодые животные":

CREATE TABLE young_animals (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    age_in_months INT(11) NOT NULL,
    PRIMARY KEY (name)
);

Заполнение таблицы "молодые животные" с помощью запроса, который выбирает животных старше 1 года, но младше 3 лет, и вычисляет их возраст в месяцах:

INSERT INTO young_animals (name, birthdate, age_in_months)
SELECT name, birthdate, TIMESTAMPDIFF(MONTH, birthdate, NOW()) AS age_in_months
FROM (
    SELECT name, birthdate
    FROM horses
    UNION ALL
    SELECT name, birthdate
    FROM donkeys
    UNION ALL
    SELECT name, birthdate
    FROM dogs
    UNION ALL
    SELECT name, birthdate
    FROM cats
    UNION ALL
    SELECT name, birthdate
    FROM hamsters
) AS all_animals
WHERE birthdate <= DATE_SUB(NOW(), INTERVAL 1 YEAR)
AND birthdate >= DATE_SUB(NOW(), INTERVAL 3 YEAR);

# Чтобы объединить таблицы "кони", "ослы", "собаки", "кошки" и "хомяки" в одну таблицу с сохранением информации о прошлой принадлежности к старым таблицам, выполните следующий SQL-запрос:

CREATE TABLE all_animals (
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    carrying_capacity INT(11),
    fluffy BOOLEAN,
    animal_type VARCHAR(50) NOT NULL,
    PRIMARY KEY (name, animal_type)
);

INSERT INTO all_animals (name, birthdate, carrying_capacity, fluffy, animal_type)
SELECT name, birthdate, carrying_capacity, NULL, 'horse' AS animal_type
FROM horses
UNION ALL
SELECT name, birthdate, carrying_capacity, NULL, 'donkey' AS animal_type
FROM donkeys
UNION ALL
SELECT name, birthdate, NULL, fluffy, 'dog' AS animal_type
FROM dogs
UNION ALL
SELECT name, birthdate, NULL, fluffy, 'cat' AS animal_type
FROM cats
UNION ALL
SELECT name, birthdate, NULL, fluffy, 'hamster' AS animal_type
FROM hamsters;