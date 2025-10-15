package com.grao.grao_app.controller;

import java.util.List;

import com.grao.grao_app.dto.DespesasRequestDTO;
import com.grao.grao_app.dto.DespesasResponseDTO;
import com.grao.grao_app.service.DespesasService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/despesas")
public class DespesasController {

    private final DespesasService despesasService;

    public DespesasController(DespesasService despesasService) {
        this.despesasService = despesasService;
    }

    @GetMapping
    public ResponseEntity<List<DespesasResponseDTO>> listar(){
        List<DespesasResponseDTO> despesas = despesasService.listarDespesas();
        return ResponseEntity.ok(despesas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DespesasResponseDTO> listarPeloId(@PathVariable Long id) {
        DespesasResponseDTO despesaId = despesasService.despesaPeloId(id);
        return ResponseEntity.ok(despesaId);
    }

    @PostMapping
    public ResponseEntity<DespesasResponseDTO> adicionar(@RequestBody DespesasRequestDTO despesas) {
        DespesasResponseDTO despesaCriar = despesasService.salvar(despesas);
        return ResponseEntity.ok(despesaCriar);
    }
    @DeleteMapping("/{despesaId}")
    public void deletarDespesa(@PathVariable Long despesaId) {
        despesasService.deletar(despesaId);
    }
}
