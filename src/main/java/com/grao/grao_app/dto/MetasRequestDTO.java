package com.grao.grao_app.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class MetasRequestDTO {

    private String titulo;
    private String descricao;
    private BigDecimal valor_objetivo;
    private BigDecimal valor_atual;
    private LocalDate prazo;
    private String status;
    private String categoria;
    private LocalDateTime data_criacao;
    private LocalDate data_conclusao;

}
