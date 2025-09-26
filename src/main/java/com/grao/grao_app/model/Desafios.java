package com.grao.grao_app.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Desafios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private double valor_desafio;
    private String descricao_desafio;
    private boolean status;
    private LocalDate data_inicio;
    private LocalDate data_termino;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public double getValor_desafio() {
        return valor_desafio;
    }

    public void setValor_desafio(double valor_desafio) {
        this.valor_desafio = valor_desafio;
    }

    public String getDescricao_desafio() {
        return descricao_desafio;
    }

    public void setDescricao_desafio(String descricao_desafio) {
        this.descricao_desafio = descricao_desafio;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_termino() {
        return data_termino;
    }

    public void setData_termino(LocalDate data_termino) {
        this.data_termino = data_termino;
    }
}
