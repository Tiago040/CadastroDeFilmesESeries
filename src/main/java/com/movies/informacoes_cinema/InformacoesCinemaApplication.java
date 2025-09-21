package com.movies.informacoes_cinema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.movies.informacoes_cinema.model.Dados;
import com.movies.informacoes_cinema.model.FilmeModel;
import com.movies.informacoes_cinema.principal.Principal;
import com.movies.informacoes_cinema.repository.FilmeRepository;
import com.movies.informacoes_cinema.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InformacoesCinemaApplication implements CommandLineRunner {
	@Autowired
	private FilmeRepository filmeRepository;
	@Autowired
	private Principal principal;

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(InformacoesCinemaApplication.class, args);

	}
	public void run(String... args) throws Exception {
		principal.salvarFilme();
		principal.deletar();
	}
}
