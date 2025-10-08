CREATE TABLE IF NOT EXISTS desafios (
    id SERIAL PRIMARY KEY NOT NULL,
    titulo TEXT NOT NULL,
    valor_desafio DECIMAL(10,2) NOT NULL,
    descricao_desafio TEXT NOT NULL,
    status BOOLEAN DEFAULT FALSE,
    data_inicio DATE,
    data_termino DATE,
    usuario INTEGER NOT NULL,
    CONSTRAINT fk_usuario FOREIGN KEY (usuario) REFERENCES users(id) ON DELETE CASCADE
);