package com.grao.grao_app.controller;

import java.util.List;
import com.grao.grao_app.model.Desafios;
import com.grao.grao_app.service.DesafiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/desafios")
public class DesafiosController {

    @Autowired
    private final DesafiosService desafiosService;

    public DesafiosController(DesafiosService desafiosService) {
        this.desafiosService = desafiosService;
    }
    @PostMapping
    public Desafios criarDesafio(Desafios desafios) {
        return desafiosService.criar(desafios);
    }
    @GetMapping
    public List<Desafios> listarDesafios() {
        return desafiosService.listar();
    }
    @DeleteMapping("/{desafioId}")
    public void deletarDesafios(@PathVariable Long desafioId) {
        desafiosService.deletar(desafioId);
    }
}
