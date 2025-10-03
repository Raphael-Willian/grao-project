package com.grao.grao_app.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.grao.grao_app.model.Metas;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MetasResponseDTO {

    private String titulo;
    private String descricao;
    private BigDecimal valor_objetivo;
    private BigDecimal valor_atual;
    private LocalDate prazo;
    private String status;
    private String categoria;
    private LocalDateTime data_criacao;
    private LocalDate data_conclusao;

    public MetasResponseDTO(Metas metas) {
        this.titulo = metas.getTitulo();
        this.descricao = metas.getDescricao();
        this.valor_objetivo = metas.getValor_objetivo();
        this.valor_atual = metas.getValor_atual();
        this.prazo = metas.getPrazo();
        this.status = metas.getStatus();
        this.categoria = metas.getCategoria();
        this.data_criacao = metas.getData_criacao();
        this.data_conclusao = metas.getData_conclusao();

    }
}
