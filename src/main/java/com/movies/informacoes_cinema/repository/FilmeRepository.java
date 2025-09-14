package com.movies.informacoes_cinema.repository;

import com.movies.informacoes_cinema.model.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<FilmeModel, Long> {
}
