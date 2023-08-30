package br.com.moviesearch.main;

import br.com.moviesearch.models.Movie;
import br.com.moviesearch.models.Show;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("The Godfather");

        movie.review(9);
        movie.review(10);
        movie.review(10);
        movie.review(10);
        movie.review(8);
        movie.review(8);
        movie.review(9);
        movie.getData();
        System.out.println(movie.getStars());

        Show got = new Show("Game Of Thrones");
        got.setEpisodes(23);
        got.setEpisodeDuration(53);
        got.getData();

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movie);

        for (Movie item: movieList
             ) {
            System.out.println(item.getName());
        }

    }
}