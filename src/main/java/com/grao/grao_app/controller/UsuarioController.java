package com.grao.grao_app.controller;

import com.grao.grao_app.dto.UsuarioRequestDTO;
import com.grao.grao_app.dto.UsuarioResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.grao.grao_app.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar() {
        List<UsuarioResponseDTO> usuarios = service.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }
    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> criar(@RequestBody UsuarioRequestDTO dto) {
        UsuarioResponseDTO usuarioCriado = service.salvar(dto);
        return ResponseEntity.ok(usuarioCriado);
    }
}
