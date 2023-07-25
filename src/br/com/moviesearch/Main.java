package br.com.moviesearch;

import br.com.moviesearch.models.Movie;
import br.com.moviesearch.models.Show;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("The Godfather");

        movie.review(9);
        movie.review(10);
        movie.review(10);
        movie.review(10);
        movie.review(8);
        movie.review(8);
        movie.review(9);
        movie.getData();

        Show got = new Show();
        got.setName("Game Of Thrones");
        got.setEpisodes(23);
        got.setEpisodeDuration(53);
        got.getData();
    }
}