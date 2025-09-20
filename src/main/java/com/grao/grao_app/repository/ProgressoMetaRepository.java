package com.grao.grao_app.repository;

import java.util.List;
import com.grao.grao_app.model.Metas;
import com.grao.grao_app.model.ProgressoMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressoMetaRepository extends JpaRepository <ProgressoMeta, Long> {
    List<ProgressoMeta> findByMeta(Metas meta);
}
