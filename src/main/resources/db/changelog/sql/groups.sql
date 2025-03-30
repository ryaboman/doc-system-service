CREATE TABLE IF NOT EXISTS groups
(
    id_group    SERIAL primary KEY,
    group_name  varchar(45) NOT NULL UNIQUE,
    permission  smallint    NOT NULL DEFAULT '5',
    description varchar(255)
);