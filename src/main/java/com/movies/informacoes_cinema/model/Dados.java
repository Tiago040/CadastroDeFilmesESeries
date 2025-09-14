package com.movies.informacoes_cinema.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Year") String anoLancamento,
        @JsonAlias("Runtime") int duracao,
        @JsonAlias("ImdbRating") float avaliacao,
        @JsonAlias("Genre") String genereo,
        @JsonAlias("Actors") String atores,
        @JsonAlias("Plot") String sinopse) {
}
