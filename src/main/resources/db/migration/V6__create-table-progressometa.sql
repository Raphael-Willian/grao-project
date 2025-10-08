CREATE TABLE IF NOT EXISTS progressometa (
    id SERIAL PRIMARY KEY NOT NULL,
    meta INTEGER NOT NULL,
    valor_contribuido DECIMAL(10,2) NOT NULL,
    data_contribuicao DATE NOT NULL,
    CONSTRAINT fk_meta FOREIGN KEY (meta) REFERENCES metas(id) ON DELETE CASCADE
);