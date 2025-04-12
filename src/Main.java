import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Spirited Away");
        myMovie.setYearOfRelease(2011);
        myMovie.setLengthInMinutes(120);

//      myMovie.printMovieInfo();
//      System.out.println(myMovie.averageRating());
//      System.out.println("Total number of ratings: " + myMovie.getNumberOfRatings());

        Serie mySerie = new Serie();
        mySerie.setTitle("Game of Thrones");
        mySerie.setYearOfRelease(2011);
        mySerie.setLengthInMinutes(120);
        mySerie.setNumberOfSeasons(5);
        mySerie.setNumberOfEpisodes(12);
        mySerie.setActive(true);
        mySerie.setMinutesPerEpisode(15);

        mySerie.printMovieInfo();
        System.out.println(mySerie.averageRating());
        System.out.println("Total number of ratings: " + mySerie.getNumberOfRatings());
    }


}
