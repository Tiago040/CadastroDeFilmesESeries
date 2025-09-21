package com.movies.informacoes_cinema.controller;

import com.movies.informacoes_cinema.model.FilmeModel;
import com.movies.informacoes_cinema.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
@CrossOrigin(origins = "*")
public class FilmeController {

    //injeção de dependência
    @Autowired
    private FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping
    public List<FilmeModel> getAll() {
        return filmeService.getAll();
    }

    @PostMapping("/{id}")
    public FilmeModel create(@RequestBody FilmeModel filmeModel) {return filmeService.save(filmeModel);}


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        filmeService.delete(id);
    }
}
