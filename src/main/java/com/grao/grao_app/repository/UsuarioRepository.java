package com.grao.grao_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grao.grao_app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
