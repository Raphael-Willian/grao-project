package com.grao.grao_app.service;

import com.grao.grao_app.dto.UsuarioRequestDTO;
import com.grao.grao_app.dto.UsuarioResponseDTO;
import com.grao.grao_app.enums.UserRole;
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
    public List<UsuarioResponseDTO> listarUsuarios() {

        List<Usuario> usuarios = repository.findAll();

        List<UsuarioResponseDTO> usuariosDTO = usuarios.stream()
                .map(UsuarioResponseDTO::new)
                .toList();

        return usuariosDTO;

    }
    public UsuarioResponseDTO salvar(UsuarioRequestDTO dto) {
        Usuario usuario = new Usuario(dto.getNome(),dto.getEmail(), UserRole.USER, dto.getPassword());
        Usuario salvo = repository.save(usuario);
        return new UsuarioResponseDTO(salvo);
    }
}
