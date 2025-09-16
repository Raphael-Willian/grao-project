package com.grao.grao_app.controller;

import com.grao.grao_app.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.grao.grao_app.model.Usuario;
import com.grao.grao_app.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
    @GetMapping
    public List<Usuario> listar() {
        return service.listarUsuarios();
    }
    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }

}
