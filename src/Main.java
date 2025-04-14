import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Spirited Away");
        myMovie.setYearOfRelease(2011);
        myMovie.setLengthInMinutes(120);

        myMovie.printMovieInfo();
        System.out.println(myMovie.averageRating());
        System.out.println("Total number of ratings: " + myMovie.getNumberOfRatings());

        Serie mySerie = new Serie();
        mySerie.setTitle("Game of Thrones");
        mySerie.setYearOfRelease(2011);
        mySerie.setLengthInMinutes(120);
        mySerie.setNumberOfSeasons(5);
        mySerie.setNumberOfEpisodes(12);
        mySerie.setActive(true);
        mySerie.setMinutesPerEpisode(50);

        mySerie.printMovieInfo();
        System.out.println(mySerie.averageRating());
        System.out.println("Total number of minutes: " + mySerie.getLengthInMinutes());

        Movie myMovie2 = new Movie();
        myMovie2.setTitle("Harry Potter");
        myMovie2.setYearOfRelease(2011);
        myMovie2.setLengthInMinutes(130);



        TimeCalculator calculator = new TimeCalculator();
        calculator.adds(myMovie);
        calculator.adds(myMovie2);
        calculator.adds(mySerie);
        System.out.println("Total movie time: " + calculator.getTotalOfTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(mySerie);
        episode.setTotalViews(300);
        filter.filter(episode);
    }
}
