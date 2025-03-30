CREATE TABLE IF NOT EXISTS morphemes (
                                      id_morpheme SERIAL primary KEY,
                                      name_morpheme varchar(45) NOT NULL,
                                      permission smallint NOT NULL DEFAULT '5',
                                      last_update TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);