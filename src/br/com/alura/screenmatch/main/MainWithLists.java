package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Spirited Away", 2001);
        myMovie.addRating(10);
        Movie myMovie2 = new Movie("Harry Potter", 2011);
        myMovie2.addRating(8);
        Movie myMovie3 = new Movie("Princess Mononoke", 2001);
        myMovie3.addRating(9);
        Serie mySerie = new Serie("Game of Thrones", 2011);


        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(myMovie2);
        list.add(myMovie3);
        list.add(mySerie);

        for (Title title : list) {
//            title.printMovieInfo();
            System.out.println(title.getTitle());
            if (title instanceof Movie movie && movie.getRating() > 2) {
                System.out.println("Rating: " + movie.getRating());
            }
        }

        List<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Brad Pitt");
        searchByArtist.add("Tom Hanks");
        searchByArtist.add("Angelina Jolie");

        Collections.sort(searchByArtist); //ordena a lista de forma alfabetica.
        System.out.println(searchByArtist);
        System.out.println("Lista ordenada:");
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Title::getYearOfRelease)); //ordena a lista de acordo com o ano de lancamento.
        System.out.println("Lista ordenada por ano de lancamento:");
        System.out.println(list);
    }
}
