package com.movies.informacoes_cinema.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversor {
    private ObjectMapper objectMapper = new ObjectMapper();

    public <A> A obterDados(String json, Class<A> classe) {
        try {
            return objectMapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
