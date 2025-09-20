package com.grao.grao_app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ProgressoMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "metas_id")
    @JsonIgnore
    private Metas meta;

    private BigDecimal valor_contribuido;
    private LocalDate data_contribuicao;
    private String observacao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Metas getMetas() {
        return meta;
    }

    public void setMetas(Metas metas) {
        this.meta = metas;
    }

    public BigDecimal getValor_contribuido() {
        return valor_contribuido;
    }

    public void setValor_contribuido(BigDecimal valor_contribuido) {
        this.valor_contribuido = valor_contribuido;
    }

    public LocalDate getData_contribuicao() {
        return data_contribuicao;
    }

    public void setData_contribuicao(LocalDate data_contribuicao) {
        this.data_contribuicao = data_contribuicao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
