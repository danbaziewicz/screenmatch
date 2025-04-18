package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Spirited Away", 2001);
//        myMovie.setTitle();
//        myMovie.setYearOfRelease(2011);
        myMovie.setLengthInMinutes(120);

        myMovie.printMovieInfo();
        System.out.println(myMovie.averageRating());
        System.out.println("Total number of ratings: " + myMovie.getNumberOfRatings());

        Serie mySerie = new Serie("Game of Thrones", 2011);
//        mySerie.setTitle();
//        mySerie.setYearOfRelease(2011);
        mySerie.setLengthInMinutes(120);
        mySerie.setNumberOfSeasons(5);
        mySerie.setNumberOfEpisodes(12);
        mySerie.setActive(true);
        mySerie.setMinutesPerEpisode(50);

        mySerie.printMovieInfo();
        System.out.println(mySerie.averageRating());
        System.out.println("Total number of minutes: " + mySerie.getLengthInMinutes());

        Movie myMovie2 = new Movie("Harry Potter", 2011);
//        myMovie2.setTitle();
//        myMovie2.setYearOfRelease(2011);
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

        Movie myMovie3 = new Movie("Princess Mononoke", 2001);
//        myMovie3.setTitle();
//        myMovie3.setYearOfRelease(2001);
        myMovie3.setLengthInMinutes(135);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(myMovie2);
        movieList.add(myMovie3);
        System.out.println("Total of movies: " + movieList.size());
        System.out.println("First movie: " + movieList.get(0).getTitle());
        System.out.println("toString of first movie: " + movieList.get(0).toString());
        System.out.println(movieList);


    }
}
