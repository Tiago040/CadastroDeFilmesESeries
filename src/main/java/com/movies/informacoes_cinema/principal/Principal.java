package com.movies.informacoes_cinema.principal;

import com.movies.informacoes_cinema.model.Dados;
import com.movies.informacoes_cinema.model.FilmeModel;
import com.movies.informacoes_cinema.repository.FilmeRepository;
import com.movies.informacoes_cinema.service.ApiService;
import com.movies.informacoes_cinema.service.Conversor;
import com.movies.informacoes_cinema.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@Component
public class Principal {
    final ApiService apiService = new ApiService();
    final Conversor conversor = new Conversor();
    final Scanner scanner = new Scanner(System.in);
    final String endereco = "http://www.omdbapi.com/?t=";
    @Value("${api.key}")
    private String apiKey;
    @Autowired
    private FilmeService filmeService;
    FilmeRepository filmeRepository;
    FilmeModel filmeModel;
    private List<FilmeModel> filme;

    public Principal (FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }



    public Dados mostraFilme() {
        var json = apiService.getApi("http://www.omdbapi.com/?t=bad+boys&apikey=35210aeb");
        Dados dados = conversor.obterDados(json, Dados.class);
        System.out.println(dados);
        return dados;
    }

    // Procurar por um filme ou série na API
    public Dados buscarNaApi() {
        System.out.println("Digite o nome de uma série ou filme para busca: ");
        var busca = scanner.nextLine();
        var json = apiService.getApi(endereco + busca.replace(" ", "+") + apiKey);
        Dados dados = conversor.obterDados(json, Dados.class);
        System.out.println(dados);
        return dados;
    }

    // Salvar um filme no banco de dados
    public void salvarFilme() {
        filmeRepository.save(new FilmeModel(buscarNaApi()));
    }

    // Listar Filmes ou séries salvas no banco
    public void listar() {
        filme = filmeRepository.findAll();
        filme.stream().sorted(Comparator.comparing(FilmeModel::getTitulo)).forEach(System.out::println);
    }

    // Deletar um filme do banco de dados pelo nome
    public void deletar() {
        listar();
        System.out.println("Digite o nome de um filme para ser removido da lista: ");
        var titulo = scanner.nextLine();
        filmeService.deleteNome(titulo);
    }
}
