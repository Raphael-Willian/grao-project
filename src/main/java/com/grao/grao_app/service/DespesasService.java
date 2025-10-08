package com.grao.grao_app.service;

import java.util.List;

import com.grao.grao_app.dto.DespesasRequestDTO;
import com.grao.grao_app.dto.DespesasResponseDTO;
import com.grao.grao_app.exceptions.EventNotFoundException;
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

        if (despesas.isEmpty()) {
            throw new EventNotFoundException("Despesas não encontradas.");
        }

        List<DespesasResponseDTO> despesasDTO = despesas.stream()
                .map(DespesasResponseDTO::new)
                .toList();
        return despesasDTO;
    }

    public DespesasResponseDTO despesaPeloId(Long id) {
        Despesas despesaId = repository.findById(id)
                .orElseThrow(EventNotFoundException::new);

        return new DespesasResponseDTO(despesaId);
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
