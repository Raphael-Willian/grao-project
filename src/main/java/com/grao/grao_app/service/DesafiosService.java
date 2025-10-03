package com.grao.grao_app.service;
import java.util.List;

import com.grao.grao_app.dto.DesafiosRequestDTO;
import com.grao.grao_app.dto.DesafiosResponseDTO;
import com.grao.grao_app.model.Desafios;
import com.grao.grao_app.repository.DesafiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesafiosService {

    @Autowired
    private final DesafiosRepository desafiosRepository;

    public DesafiosService(DesafiosRepository desafiosRepository) {
        this.desafiosRepository = desafiosRepository;
    }
    public DesafiosResponseDTO criar(DesafiosRequestDTO dto) {

        Desafios desafios = new Desafios();

        desafios.setTitulo(dto.getTitulo());
        desafios.setValor_desafio(dto.getValor_desafio());
        desafios.setDescricao_desafio(dto.getDescricao_desafio());
        desafios.setStatus(dto.isStatus());
        desafios.setData_inicio(dto.getData_inicio());
        desafios.setData_termino(dto.getData_termino());

        Desafios salvo = desafiosRepository.save(desafios);

        return new DesafiosResponseDTO(salvo);
    }
    public List<DesafiosResponseDTO> listar() {

        List<Desafios> desafios = desafiosRepository.findAll();

        List<DesafiosResponseDTO> desafiosDTO = desafios.stream()
                .map(DesafiosResponseDTO::new)
                .toList();
        return desafiosDTO;

    }
    public void deletar(Long desafioId) {
        desafiosRepository.deleteById(desafioId);
    }
}
