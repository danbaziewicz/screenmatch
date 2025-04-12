package br.com.alura.screenmatch.models;

public class Title {
    private String title;
    private int yearOfRelease;
    private boolean includedInPlan;
    private int numberOfRatings;
    private double totalRating;
    private double lengthInMinutes;

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public void printMovieInfo() {
        System.out.println("br.com.alura.screenmatch.models.Movie.Movie title: " + title);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("Total rating: " + totalRating);
        System.out.println("Length in minutes: " + lengthInMinutes);
    }

    public void addRating(double rating) {
        totalRating += rating;
        numberOfRatings++;
    }

    public double averageRating() {
        return totalRating/numberOfRatings;
    }
}
