package com.grao.grao_app.dto;

import com.grao.grao_app.model.Despesas;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class DespesasResponseDTO {

    private BigDecimal valor;
    private LocalDate data;
    private String descricao;

    public DespesasResponseDTO(Despesas despesas) {
        this.valor = despesas.getValor();
        this.data = despesas.getData();
        this.descricao = despesas.getDescricao();
    }

}
