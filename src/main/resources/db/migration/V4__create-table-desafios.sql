CREATE TABLE IF NOT EXISTS desafios (
    id PRIMARY KEY UNIQUE NOT NULL,
    titulo TEXT NOT NULL,
    valor_desafio DECIMAL NOT NULL,
    descricao_desafio TEXT NOT NULL,
    status BOOLEAN DEFAULT FALSE,
    data_inicio DATE
    data_termino DATE
    usuario FOREIGN KEY NOT NULL
)