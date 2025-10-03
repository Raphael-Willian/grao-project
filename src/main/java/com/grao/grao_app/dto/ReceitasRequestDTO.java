package com.grao.grao_app.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class ReceitasRequestDTO {

    private BigDecimal valor;
    private String descricao;
    private String usuario;

}
