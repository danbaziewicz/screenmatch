package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Rating;

public class Episode implements Rating {
    private int number;
    private String title;
    private Serie serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getRating() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
