CREATE TABLE IF NOT EXISTS documents (
                    id_document SERIAL PRIMARY KEY,
                    id_designator INTEGER NOT NULL,
                    number INTEGER NOT NULL,
                    name varchar(100) NOT NULL,
                    date date NOT NULL,
                    summary text,
                    id_user INTEGER DEFAULT NULL,
                    editing_status bytea DEFAULT '0',
                    pathToFile varchar(260) DEFAULT NULL,
                    archive_contents json DEFAULT NULL,
                    last_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    CONSTRAINT fk_ped_on_ped FOREIGN KEY (id_designator) REFERENCES designators (id_designator) ON DELETE NO ACTION ON UPDATE NO ACTION,
                    CONSTRAINT fk_user FOREIGN KEY (id_user) REFERENCES users (id_user) ON DELETE SET NULL ON UPDATE NO ACTION
    );
