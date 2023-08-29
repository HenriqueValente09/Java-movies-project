package br.com.moviesearch.models;

import br.com.moviesearch.calc.StarRating;

public class Movie extends Title implements StarRating {
    private String director;

    public Movie(String name){
        super(name);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getStars() {
        return (int) (this.getRating()/this.getReviewsAmount()) / 2;
    }
}
