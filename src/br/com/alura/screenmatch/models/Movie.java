package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Rating;

public class Movie extends Title implements Rating {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) (averageRating() / 2);
    }
}
