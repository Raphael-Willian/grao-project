package com.grao.grao_app.model;

import jakarta.persistence.*;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Metas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String titulo;
    private String descricao;
    private BigDecimal valor_objetivo;
    private BigDecimal valor_atual;
    private LocalDate prazo;
    private String status;
    private String categoria;
    private LocalDateTime data_criacao;
    private LocalDate data_conclusao;

    @OneToMany(mappedBy = "meta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProgressoMeta> progressoMeta;

    public List<ProgressoMeta> getProgressoMeta() {
        return progressoMeta;
    }

    public void setProgressoMeta(List<ProgressoMeta> progressoMeta) {
        this.progressoMeta = progressoMeta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor_objetivo() {
        return valor_objetivo;
    }

    public void setValor_objetivo(BigDecimal valor_objetivo) {
        this.valor_objetivo = valor_objetivo;
    }

    public BigDecimal getValor_atual() {
        return valor_atual;
    }

    public void setValor_atual(BigDecimal valor_atual) {
        this.valor_atual = valor_atual;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }

    public LocalDate getData_conclusao() {
        return data_conclusao;
    }

    public void setData_conclusao(LocalDate data_conclusao) {
        this.data_conclusao = data_conclusao;
    }
}
