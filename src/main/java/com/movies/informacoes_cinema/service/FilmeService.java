package com.movies.informacoes_cinema.service;

import com.movies.informacoes_cinema.model.FilmeModel;
import com.movies.informacoes_cinema.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    // Listar
    public List<FilmeModel> getAll(){
        return filmeRepository.findAll();
    }

    // Criar
    public FilmeModel save(FilmeModel filmeModel) {return filmeRepository.save(filmeModel);}

    //Delete
    public void delete(Long id) {filmeRepository.deleteById(id);}
}
