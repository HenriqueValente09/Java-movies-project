package br.com.moviesearch.models;

public class Show extends Title{
    private int seasons;
    private int episodes;
    private int episodeDuration;
    private boolean active;

    public Show(String name) {
        super(name);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void getData() {
        System.out.println("Name: " + this.getName());
        System.out.println("Release Date: " + this.getReleaseDate());
        System.out.println("Length: " + this.getEpisodes() * this.getEpisodeDuration());
        System.out.println("Rating: " + String.format("%.2f", this.getRating()/this.getReviewsAmount()));
        System.out.println("Reviews: " + this.getReviewsAmount());
    }
}
