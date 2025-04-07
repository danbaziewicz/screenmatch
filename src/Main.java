public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "Spirited Away";
        myMovie.yearOfRelease = 2001;
        myMovie.includedInPlan = true;
        myMovie.totalRating = 80;
        myMovie.lengthInMinutes = 120;
        System.out.println(myMovie.title);
        System.out.println(myMovie.yearOfRelease);
        System.out.println(myMovie.includedInPlan);
        System.out.println(myMovie.totalRating);
        System.out.println(myMovie.lengthInMinutes);
    }
}
