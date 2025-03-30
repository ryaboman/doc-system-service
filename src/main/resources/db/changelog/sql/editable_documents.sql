-- Таблица редактируемых документов пользователями.
-- На редактирование дается определенное время.
-- Если за это время не было завершено редактирование, оно завершается принудительно.
-- При этом пользователь будет проинформирован.
CREATE TABLE IF NOT EXISTS editable_documents (
                  id_editable_documents SERIAL PRIMARY KEY,
                  id_document INTEGER NOT NULL UNIQUE,
                  id_user INTEGER NOT NULL,
                  time_begin TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                  CONSTRAINT fk_ped_on_document FOREIGN KEY (id_document) REFERENCES documents (id_document) ON DELETE CASCADE ON UPDATE NO ACTION,
                  CONSTRAINT fk_user_edit FOREIGN KEY (id_user) REFERENCES users (id_user) ON DELETE CASCADE ON UPDATE NO ACTION
);