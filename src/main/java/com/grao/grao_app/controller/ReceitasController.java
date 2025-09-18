package com.grao.grao_app.controller;

import java.util.List;
import com.grao.grao_app.service.ReceitasService;
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
    public List<Receitas> listar() {
        return receitasService.listarReceitas();
    }
    @PostMapping
    public Receitas adicionar(@RequestBody Receitas receitas) {
        return receitasService.adicionar(receitas);
    }

}
