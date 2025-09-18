package com.grao.grao_app.controller;

import java.util.List;
import com.grao.grao_app.model.Despesas;
import com.grao.grao_app.service.DespesasService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/despesas")
public class DespesasController {

    private final DespesasService despesasService;

    public DespesasController(DespesasService despesasService) {
        this.despesasService = despesasService;
    }

    @GetMapping
    public List<Despesas> listar(){
        return despesasService.listarDespesas();
    }
    @PostMapping
    public Despesas adicionar(@RequestBody Despesas despesas) {
        return despesasService.salvar(despesas);
    }

}
