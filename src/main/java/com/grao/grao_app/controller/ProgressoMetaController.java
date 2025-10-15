package com.grao.grao_app.controller;

import com.grao.grao_app.model.ProgressoMeta;
import com.grao.grao_app.service.ProgressoMetaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/metas")
public class ProgressoMetaController {

    private final ProgressoMetaService progressoMetaService;

    public ProgressoMetaController(ProgressoMetaService progressoMetaService) {
        this.progressoMetaService = progressoMetaService;
    }

    @PostMapping("/{metaId}/progresso")
    public ResponseEntity<ProgressoMeta> adicionarProgresso(
            @PathVariable Long metaId,
            @RequestBody ProgressoMeta progressoMeta) {

        ProgressoMeta novoProgresso = progressoMetaService.adicionarProgresso(metaId, progressoMeta);
        return ResponseEntity.ok(novoProgresso);
    }
    @DeleteMapping("/{progressoId}/progresso")
    public void deletarProgresso(@PathVariable Long progressoId) {
        progressoMetaService.deletar(progressoId);
    }


}
