package com.grao.grao_app.service;

import java.util.List;
import com.grao.grao_app.model.Receitas;
import com.grao.grao_app.repository.ReceitasRepository;
import org.springframework.stereotype.Service;

@Service
public class ReceitasService {

    private final ReceitasRepository receitasRepository;

    public ReceitasService(ReceitasRepository receitasRepository) {
        this.receitasRepository = receitasRepository;
    }

    public List<Receitas> listarReceitas() {
        return receitasRepository.findAll();
    }
    public Receitas adicionar(Receitas receitas) {
        return receitasRepository.save(receitas);
    }
}
