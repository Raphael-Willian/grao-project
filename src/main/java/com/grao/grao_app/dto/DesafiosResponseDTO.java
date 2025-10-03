package com.grao.grao_app.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import com.grao.grao_app.model.Desafios;

@Getter
@Setter
public class DesafiosResponseDTO {

    private String titulo;
    private double valor_desafio;
    private String descricao_desafio;
    private boolean status;
    private LocalDate data_inicio;
    private LocalDate data_termino;

    public DesafiosResponseDTO(){
    }

    public DesafiosResponseDTO(Desafios desafios) {
        this.titulo = desafios.getTitulo();
        this.valor_desafio = desafios.getValor_desafio();
        this.descricao_desafio = desafios.getDescricao_desafio();
        this.status = desafios.isStatus();
        this.data_inicio = desafios.getData_inicio();
        this.data_termino = desafios.getData_termino();
    }

}
