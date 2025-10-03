package com.grao.grao_app.dto;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import com.grao.grao_app.model.Receitas;

@Getter
@Setter
public class ReceitasResponseDTO {

    private BigDecimal valor;
    private String descricao;

    public ReceitasResponseDTO(Receitas receitas) {
        this.valor = receitas.getValor();
        this.descricao = receitas.getDescricao();
    }
}
