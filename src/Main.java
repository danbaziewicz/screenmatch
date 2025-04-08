import br.com.alura.screenmatch.models.Movie.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Spirited Away");
        myMovie.setYearOfRelease(2011);
        myMovie.setLengthInMinutes(120);

        myMovie.printMovieInfo();
        System.out.println(myMovie.averageRating());
        System.out.println("Total number of ratings: " + myMovie.getNumberOfRatings());

    }


}
