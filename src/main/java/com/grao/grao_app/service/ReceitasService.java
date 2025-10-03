package com.grao.grao_app.service;

import java.util.List;
import com.grao.grao_app.dto.ReceitasRequestDTO;
import com.grao.grao_app.dto.ReceitasResponseDTO;
import com.grao.grao_app.model.Receitas;
import com.grao.grao_app.repository.ReceitasRepository;
import org.springframework.stereotype.Service;

@Service
public class ReceitasService {

    private final ReceitasRepository receitasRepository;

    public ReceitasService(ReceitasRepository receitasRepository) {
        this.receitasRepository = receitasRepository;
    }

    public List<ReceitasResponseDTO> listarReceitas() {

        List<Receitas> receitas = receitasRepository.findAll();

        List<ReceitasResponseDTO> receitasDTO = receitas.stream()
                .map(ReceitasResponseDTO::new)
                .toList();

        return receitasDTO;

    }
    public ReceitasResponseDTO adicionar(ReceitasRequestDTO dto) {
        Receitas receita = new Receitas();
        receita.setValor(dto.getValor());
        receita.setDescricao(dto.getDescricao());

        Receitas salvo = receitasRepository.save(receita);

        return new ReceitasResponseDTO(salvo);
    }
    public void deletar(Long receitaId) {
        receitasRepository.deleteById(receitaId);
    }
}
