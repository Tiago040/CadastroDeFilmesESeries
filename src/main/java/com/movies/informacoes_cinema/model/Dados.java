package com.movies.informacoes_cinema.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Year") int anoLancamento,
        @JsonAlias("Runtime") String duracao,
        @JsonAlias("imdbRating") float avaliacao,
        @JsonAlias("Genre") String genero,
        @JsonAlias("Actors") String atores,
        @JsonAlias("Plot") String sinopse) {
}
