package com.grao.grao_app.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Despesas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal valor;
    private LocalDate data;
    private String descricao;

    //conectando a despesa ao usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id") //nomeando coluna que aponta para o usuario
    private Usuario usuario;

}
