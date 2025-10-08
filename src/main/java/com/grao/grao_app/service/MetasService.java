package com.grao.grao_app.service;

import java.util.List;

import com.grao.grao_app.dto.MetasRequestDTO;
import com.grao.grao_app.dto.MetasResponseDTO;
import com.grao.grao_app.exceptions.EventNotFoundException;
import com.grao.grao_app.model.Metas;
import com.grao.grao_app.repository.MetasRepository;
import org.springframework.stereotype.Service;

@Service
public class MetasService {

    private final MetasRepository metasRepository;

    public MetasService(MetasRepository metasRepository) {
        this.metasRepository = metasRepository;
    }
    public List<MetasResponseDTO> listarMetas() {
        List<Metas> metas = metasRepository.findAll();

        if (metas.isEmpty()) {
            throw new EventNotFoundException("Nenhuma meta encontrada.");
        }

        List<MetasResponseDTO> metasDTO = metas.stream()
                .map(MetasResponseDTO::new)
                .toList();
        return metasDTO;
    }

    public MetasResponseDTO listarMetaId(Long id) {
        Metas meta = metasRepository.findById(id)
                .orElseThrow(EventNotFoundException::new);

        return new MetasResponseDTO(meta);
    }

    public MetasResponseDTO adicionarMetas(MetasRequestDTO dto) {

        Metas novaMeta = new Metas();
        novaMeta.setValor_atual(dto.getValor_atual());
        novaMeta.setTitulo(dto.getTitulo());
        novaMeta.setDescricao(dto.getDescricao());
        novaMeta.setValor_objetivo(dto.getValor_objetivo());
        novaMeta.setPrazo(dto.getPrazo());
        novaMeta.setStatus(dto.getStatus());
        novaMeta.setCategoria(dto.getCategoria());
        novaMeta.setData_criacao(dto.getData_criacao());
        novaMeta.setData_conclusao(dto.getData_conclusao());

        Metas salvo = metasRepository.save(novaMeta);

        return new MetasResponseDTO(salvo);

    }
    public void deletar(Long metaId) {
        metasRepository.deleteById(metaId);
    }
}
