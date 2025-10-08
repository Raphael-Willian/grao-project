CREATE TABLE IF NOT EXISTS metas (
    id PRIMARY KEY UNIQUE NOT NULL,
    usuario TEXT NOT NULL,
    titulo TEXT NOT NULL,
    descricao TEXT NOT NULL,
    valor_objetivo DECIMAL NOT NULL,
    valor_atual DECIMAL,
    prazo DATE NOT NULL,
    status BOOLEAN DEFAULT FALSE,
    categoria TEXT NOT NULL,
    data_criacao DATE,
    data_conclusao DATE,
    <--ADICIONAR PROGRESSO DE META POSTERIORMENTE-->
)