package com.grao.grao_app.service;

import java.util.List;
import com.grao.grao_app.repository.DespesasRepository;
import com.grao.grao_app.model.Despesas;
import org.springframework.stereotype.Service;

@Service
public class DespesasService {

    private final DespesasRepository repository;

    public DespesasService(DespesasRepository repository) {
        this.repository = repository;
    }
    public List<Despesas> listarDespesas() {
        return repository.findAll();
    }
    public Despesas salvar(Despesas despesas) {
        return repository.save(despesas);
    }
    public void deletar(Long despesaId) {
        repository.deleteById(despesaId);
    }
}
