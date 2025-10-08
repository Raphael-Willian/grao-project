CREATE TABLE IF NOT EXISTS metas (
    id SERIAL PRIMARY KEY NOT NULL,
    usuario INTEGER NOT NULL,
    titulo TEXT NOT NULL,
    descricao TEXT NOT NULL,
    valor_objetivo DECIMAL(10,2) NOT NULL,
    valor_atual DECIMAL(10,2),
    prazo DATE NOT NULL,
    status BOOLEAN DEFAULT FALSE,
    categoria TEXT NOT NULL,
    data_criacao DATE,
    data_conclusao DATE,
    CONSTRAINT fk_usuario FOREIGN KEY (usuario) REFERENCES users(id) ON DELETE CASCADE
);