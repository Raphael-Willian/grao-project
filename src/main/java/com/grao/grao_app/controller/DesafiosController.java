package com.grao.grao_app.controller;

import java.util.List;

import com.grao.grao_app.dto.DesafiosRequestDTO;
import com.grao.grao_app.dto.DesafiosResponseDTO;
import com.grao.grao_app.model.Desafios;
import com.grao.grao_app.service.DesafiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<DesafiosResponseDTO> criarDesafio(DesafiosRequestDTO dto) {
        DesafiosResponseDTO desafio = desafiosService.criar(dto);
        return ResponseEntity.ok(desafio);
    }

    @GetMapping
    public ResponseEntity<List<DesafiosResponseDTO>> listarDesafios() {
        List<DesafiosResponseDTO> desafios = desafiosService.listar();
        return ResponseEntity.ok(desafios);
    }

    @DeleteMapping("/{desafioId}")
    public void deletarDesafios(@PathVariable Long desafioId) {
        desafiosService.deletar(desafioId);
    }
}
