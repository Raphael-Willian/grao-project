package com.grao.grao_app.service;

import java.util.List;
import com.grao.grao_app.model.Metas;
import com.grao.grao_app.repository.MetasRepository;
import org.springframework.stereotype.Service;

@Service
public class MetasService {

    private final MetasRepository metasRepository;

    public MetasService(MetasRepository metasRepository) {
        this.metasRepository = metasRepository;
    }
    public List<Metas> listarMetas() {
        return metasRepository.findAll();
    }
    public Metas adicionarMetas(Metas metas) {
        return metasRepository.save(metas);
    }
    public void deletar(Long metaId) {
        metasRepository.deleteById(metaId);
    }
}
