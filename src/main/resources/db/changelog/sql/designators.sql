CREATE TABLE IF NOT EXISTS designators (
                                           id_designator SERIAL PRIMARY KEY,
                                           id_prefix integer NOT NULL,
                                           id_postfix integer NOT NULL,
                                           update_method integer NOT NULL,
                                           status_designator smallint NOT NULL DEFAULT '0',
                                           CONSTRAINT fk_ped_on_postfix FOREIGN KEY (id_postfix) REFERENCES morphemes (id_morpheme) ON DELETE CASCADE ON UPDATE NO ACTION,
                                           CONSTRAINT fk_ped_on_prefix FOREIGN KEY (id_prefix) REFERENCES morphemes (id_morpheme) ON DELETE CASCADE ON UPDATE NO ACTION,
                                           UNIQUE (id_prefix, id_postfix)
    );
COMMENT ON COLUMN designators.update_method is 'Способ обновления номера документа для текущего соотношения приставки и окончания';
COMMENT ON COLUMN designators.status_designator is 'Статус говорит можно ли использовать это соотношения приставки и окончания или уже нельзя';