package com.grao.grao_app.service;

import java.util.List;

import com.grao.grao_app.dto.DespesasRequestDTO;
import com.grao.grao_app.dto.DespesasResponseDTO;
import com.grao.grao_app.repository.DespesasRepository;
import com.grao.grao_app.model.Despesas;
import org.springframework.stereotype.Service;

@Service
public class DespesasService {

    private final DespesasRepository repository;

    public DespesasService(DespesasRepository repository) {
        this.repository = repository;
    }
    public List<DespesasResponseDTO> listarDespesas() {

        List<Despesas> despesas = repository.findAll();

        List<DespesasResponseDTO> despesasDTO = despesas.stream()
                .map(DespesasResponseDTO::new)
                .toList();
        return despesasDTO;
    }
    public DespesasResponseDTO salvar(DespesasRequestDTO dto) {

        Despesas despesas = new Despesas();
        despesas.setValor(dto.getValor());
        despesas.setDescricao(dto.getDescricao());
        despesas.setData(dto.getData());

        Despesas salvo = repository.save(despesas);

        return new DespesasResponseDTO(salvo);
    }
    public void deletar(Long despesaId) {
        repository.deleteById(despesaId);
    }
}
