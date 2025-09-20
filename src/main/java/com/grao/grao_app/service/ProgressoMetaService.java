package com.grao.grao_app.service;


import com.grao.grao_app.model.Metas;
import com.grao.grao_app.model.ProgressoMeta;
import com.grao.grao_app.repository.MetasRepository;
import com.grao.grao_app.repository.ProgressoMetaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProgressoMetaService {

    private final ProgressoMetaRepository progressoMetaRepository;
    private final MetasRepository metasRepository;

    public ProgressoMetaService(MetasRepository metasRepository, ProgressoMetaRepository progressoMetaRepository) {
        this.progressoMetaRepository = progressoMetaRepository;
        this.metasRepository = metasRepository;
    }

    public ProgressoMeta adicionarProgresso(Long metaId, ProgressoMeta progressoMeta) {
        Metas meta = metasRepository.findById(metaId).orElseThrow(() -> new RuntimeException("Meta não encontrada"));
        progressoMeta.setMetas(meta);
        ProgressoMeta salvo = progressoMetaRepository.save(progressoMeta);

        BigDecimal somaProgressos = progressoMetaRepository
                .findByMeta(meta)
                .stream()
                .map(ProgressoMeta::getValor_contribuido)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        meta.setValor_atual(somaProgressos);
        metasRepository.save(meta);

        return salvo;
    }

}
