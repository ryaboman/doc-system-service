CREATE TABLE IF NOT EXISTS users (
                    id_user SERIAL PRIMARY KEY,
                    surname varchar(45) NOT NULL,
                    name varchar(45) NOT NULL,
                    patronymic varchar(45) NOT NULL,
                    salt varchar(45) DEFAULT NULL,
                    login varchar(45) DEFAULT NULL UNIQUE,
                    password varchar(45) DEFAULT NULL,
                    last_act  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);