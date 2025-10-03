package com.grao.grao_app.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class DespesasRequestDTO {

    private BigDecimal valor;
    private LocalDate data;
    private String descricao;

}
