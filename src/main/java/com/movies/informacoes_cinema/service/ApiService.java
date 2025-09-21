package com.movies.informacoes_cinema.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.movies.informacoes_cinema.model.Dados;
import com.movies.informacoes_cinema.model.FilmeModel;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    FilmeModel filmeModel = new FilmeModel();
    Dados dados;
    String json;

    public String getApi(String endereco) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            json = response.body();
        } catch (IOException e) {
            System.out.println("Erro ao consumir API" + e);
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return json;
    }
}
