package br.com.moviesearch;

public class Title {
    private String name;
    private int releaseDate;
    private boolean included;
    private double rating;
    private int reviewsAmount;
    private int length;

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Length: " + length);
        System.out.println("Rating: " + String.format("%.2f", rating/reviewsAmount));
        System.out.println("Reviews: " + reviewsAmount);
    }

    public void review(double userReview) {
        rating += userReview;
        reviewsAmount++;
    }
}
