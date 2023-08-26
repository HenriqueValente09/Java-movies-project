package br.com.moviesearch.models;

import br.com.moviesearch.calc.StarRating;

public class Episode implements StarRating {
    private int numero;
    private String nome;
    private Show serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Show getSerie() {
        return serie;
    }

    public void setSerie(Show serie) {
        this.serie = serie;
    }

    @Override
    public int getStars() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
