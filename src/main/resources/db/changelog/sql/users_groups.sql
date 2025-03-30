CREATE TABLE IF NOT EXISTS users_groups (
    id_group INTEGER,
    id_user INTEGER,
    PRIMARY KEY (id_group, id_user),
    CONSTRAINT fk_user FOREIGN KEY (id_user) REFERENCES users (id_user) ON DELETE CASCADE ON UPDATE NO ACTION,
    CONSTRAINT fk_group FOREIGN KEY (id_group) REFERENCES groups (id_group) ON DELETE CASCADE ON UPDATE NO ACTION
);