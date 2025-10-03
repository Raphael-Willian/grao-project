package com.grao.grao_app.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class DesafiosRequestDTO {

    private String titulo;
    private double valor_desafio;
    private String descricao_desafio;
    private boolean status;
    private LocalDate data_inicio;
    private LocalDate data_termino;

}
