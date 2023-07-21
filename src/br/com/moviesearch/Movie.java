package br.com.moviesearch;

public class Movie {
    private String name;
    private int releaseDate;
    private boolean included;
    private double rating;
    private int reviewsAmount;
    private int length;



    public void data() {
        System.out.println("Name: " + name);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Length: " + length);
        System.out.println("Rating: " + String.format("%.2f" + rating/reviewsAmount));
        System.out.println("Reviews: " + reviewsAmount);
    }

    public void review(double userReview) {
        rating += userReview;
        reviewsAmount++;
    }
}
