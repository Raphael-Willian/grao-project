package com.grao.grao_app.controller;

import java.util.List;
import com.grao.grao_app.service.MetasService;
import org.springframework.web.bind.annotation.*;
import com.grao.grao_app.model.Metas;

@RestController
@RequestMapping("/metas")
public class MetasController {

    private final MetasService metasService;

    public MetasController(MetasService metasService) {
        this.metasService = metasService;
    }

    @GetMapping
    public List<Metas> listar() {
        return metasService.listarMetas();
    }

    @PostMapping
    public Metas salvar(@RequestBody Metas metas) {
        return metasService.adicionarMetas(metas);
    }
    @DeleteMapping("/{metaId}")
    public void deletarMeta(@PathVariable Long metaId) {
        metasService.deletar(metaId);
    }


}
