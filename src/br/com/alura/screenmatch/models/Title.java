package br.com.alura.screenmatch.models;

public class Title implements Comparable<Title> {
    private String title;
    private int yearOfRelease;
    private boolean includedInPlan;
    private int numberOfRatings;
    private double totalRating;
    private int lengthInMinutes;

    public Title(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.title = myTitleOmdb.title();
        this.yearOfRelease = Integer.parseInt(myTitleOmdb.year());
//        this.lengthInMinutes = Integer.parseInt(myTitleOmdb.runtime().substring(0, 3));
        String runtime = myTitleOmdb.runtime();
        if (runtime != null && runtime.endsWith("min")) {
            String numericPart = runtime.replace("min", "").trim();
            try {
                this.lengthInMinutes = Integer.parseInt(numericPart);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter duração: " + runtime);
                this.lengthInMinutes = 0; // define 0 minutos caso não consiga converter
            }
        } else {
            this.lengthInMinutes = 0; // define 0 minutos se o formato não for esperado
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(double totalRating) {
        this.totalRating = totalRating;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }


    public void printMovieInfo() {
        System.out.println("Title: " + title);
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

    @Override
    public int compareTo(Title otherTitle) {
        return this.title.compareTo(otherTitle.getTitle());
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease + ", lengthInMinutes=" + lengthInMinutes;
    }
}
