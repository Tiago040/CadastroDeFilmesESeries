package com.movies.informacoes_cinema.repository;

import com.movies.informacoes_cinema.model.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilmeRepository extends JpaRepository<FilmeModel, Long> {

    Optional<FilmeModel> findByTitulo(String titulo);
}
