package com.grao.grao_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grao.grao_app.model.Usuario;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> (String username);
}
