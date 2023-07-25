import br.com.moviesearch.Movie;

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
        movie.data();
    }
}