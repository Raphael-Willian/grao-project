package com.grao.grao_app.controller;

import java.util.List;

import com.grao.grao_app.dto.MetasRequestDTO;
import com.grao.grao_app.dto.MetasResponseDTO;
import com.grao.grao_app.service.MetasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metas")
public class MetasController {

    private final MetasService metasService;

    public MetasController(MetasService metasService) {
        this.metasService = metasService;
    }

    @GetMapping
    public ResponseEntity<List<MetasResponseDTO>> listar() {
        List<MetasResponseDTO> metas = metasService.listarMetas();
        return ResponseEntity.ok(metas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetasResponseDTO> listarPeloId(@PathVariable Long id) {
        MetasResponseDTO metaId = metasService.listarMetaId(id);
        return ResponseEntity.ok(metaId);
    }

    @PostMapping
    public ResponseEntity<MetasResponseDTO> salvar(@RequestBody MetasRequestDTO dto) {
        MetasResponseDTO meta = metasService.adicionarMetas(dto);
        return ResponseEntity.ok(meta);
    }

    @DeleteMapping("/{metaId}")
    public void deletarMeta(@PathVariable Long metaId) {
        metasService.deletar(metaId);
    }


}
