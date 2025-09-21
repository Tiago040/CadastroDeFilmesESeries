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
    private Long id;
    private String titulo;
    private int anoDeLancamento;
    private String duracao;
    private float avaliacao;
    private String genero;
    private String atores;
    private String sinopse;


    public FilmeModel() {}

    public FilmeModel(Dados dados) {
        //this.id = id;
        this.titulo = dados.titulo();
        this.anoDeLancamento = dados.anoLancamento();
        this.duracao = dados.duracao();
        this.avaliacao = dados.avaliacao();
        this.genero = dados.genero();
        this.atores = dados.atores();
        this.sinopse = dados.sinopse();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
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

    @Override
    public String toString() {
        return "FilmeModel{" +
                "titulo='" + titulo + '\'' +
                ", anoDeLancamento='" + anoDeLancamento + '\'' +
                ", duracao=" + duracao +
                ", avaliacao=" + avaliacao +
                ", genero='" + genero + '\'' +
                ", atores='" + atores + '\'' +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}
