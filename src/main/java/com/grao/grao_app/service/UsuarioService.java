package com.grao.grao_app.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.grao.grao_app.model.Usuario;
import com.grao.grao_app.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }
    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

}
