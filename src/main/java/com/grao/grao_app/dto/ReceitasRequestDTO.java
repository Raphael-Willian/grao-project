package com.grao.grao_app.dto;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;



@Getter
@Setter
public class ReceitasRequestDTO {

    @NotNull(message = "O valor é obrigatório.")
    @Positive(message = "O valor deve ser positivo.")
    private BigDecimal valor;

    @NotNull(message = "A descrição é obrigatória.")
    @NotBlank(message = "A descrição é obrigatória.")
    private String descricao;

    @NotNull(message = "O usuário é obrigatório.")
    @NotBlank(message = "O usuário é obrigatório.")
    private String usuario;

}
