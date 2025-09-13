package com.movies.informacoes_cinema.model;

import jakarta.persistence.*;

// Entity transforma uma clase em uma entidade do BD
// JPA (Java Persistence API)
@Entity
@Table(name = "tb_cadastro")
public class FilmeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera as id's automaticamente e o
    // IDENTITY como números sequenciais.
    protected Long id;
    private String titulo;
    private int anoDeLancamento;
    private int duracao;
    private String genero;
    private String atores;
    private String sinopse;

    public FilmeModel() {}

    public FilmeModel(String titulo, int anoDeLancamento, int duracao, String genero, String atores, String sinopse) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.duracao = duracao;
        this.genero = genero;
        this.atores = atores;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
