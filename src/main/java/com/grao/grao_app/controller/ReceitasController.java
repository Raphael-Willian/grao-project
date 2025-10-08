package com.grao.grao_app.controller;

import java.util.List;

import com.grao.grao_app.dto.ReceitasRequestDTO;
import com.grao.grao_app.dto.ReceitasResponseDTO;
import com.grao.grao_app.exceptions.EventNotFoundException;
import com.grao.grao_app.service.ReceitasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.grao.grao_app.model.Receitas;

@RestController
@RequestMapping("/receitas")
public class ReceitasController {

    private final ReceitasService receitasService;

    public ReceitasController(ReceitasService receitasService) {
        this.receitasService = receitasService;
    }

    @GetMapping
    public ResponseEntity<List<ReceitasResponseDTO>> listar() {
        List<ReceitasResponseDTO> receitas = receitasService.listarReceitas();
        return ResponseEntity.ok(receitas);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ReceitasResponseDTO> listarPeloId(@PathVariable Long id) {
        ReceitasResponseDTO receitas = receitasService.listarPeloId(id);
        return ResponseEntity.ok(receitas);
    }
    @PostMapping
    public ResponseEntity<ReceitasResponseDTO> adicionar(@RequestBody ReceitasRequestDTO dto) {
        ReceitasResponseDTO receitaCriada = receitasService.adicionar(dto);
        return ResponseEntity.ok(receitaCriada);
    }
    @DeleteMapping("/{receitaId}")
    public void deletarReceita(@PathVariable Long receitaId) {
        receitasService.deletar(receitaId); //A ideia não é retornar nada ainda
    }

}
