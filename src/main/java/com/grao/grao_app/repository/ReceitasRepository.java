package com.grao.grao_app.repository;

import com.grao.grao_app.model.Receitas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitasRepository extends JpaRepository<Receitas, Long> {
}
