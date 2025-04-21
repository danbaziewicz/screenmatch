package br.com.alura.screenmatch.models;

public class Serie extends Title {
    private int numberOfSeasons;
    private int numberOfEpisodes;
    private boolean isActive;
    private int minutesPerEpisode;

    public Serie(String title, int yearOfRelease) {
        super(title, yearOfRelease);
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public double getLengthInMinutes() {
        return numberOfSeasons * numberOfEpisodes * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getTitle() + " (" + this.getYearOfRelease() + ")";
    }
}
