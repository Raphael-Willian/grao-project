package com.grao.grao_app.service;
import java.util.List;
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
    public Desafios criar(Desafios desafios) {
        return desafiosRepository.save(desafios);
    }
    public List<Desafios> listar() {
        return desafiosRepository.findAll();
    }
    public void deletar(Long desafioId) {
        desafiosRepository.deleteById(desafioId);
    }
}
