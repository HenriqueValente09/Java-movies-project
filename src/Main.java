import br.com.moviesearch.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
//        movie.name = "The Godfather";
//        movie.included = true;
//        movie.length = 175;
//        movie.releaseDate = 1972;

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