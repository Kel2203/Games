package com.example.game.repository;

import com.example.game.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
