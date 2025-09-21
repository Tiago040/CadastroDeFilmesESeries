package com.movies.informacoes_cinema.service;

import com.movies.informacoes_cinema.model.FilmeModel;
import com.movies.informacoes_cinema.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteNome(String titulo) {
        Optional<FilmeModel> filmeModelOptional = filmeRepository.findByTitulo(titulo);
        
        if (filmeModelOptional.isPresent()) {
            FilmeModel filmeParaDeletar = filmeModelOptional.get();
            filmeRepository.delete(filmeParaDeletar);
            System.out.println("Filme deletado com sucesso");
        } else {
            System.out.println("Filme não encontrado com o título" + titulo);
        }
    }

}
