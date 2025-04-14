package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalOfTime;

    public int getTotalOfTime() {
        return totalOfTime;
    }

//    public void adds(Movie m) {
//        totalOfTime += m.getLengthInMinutes();
//    }

    public void adds(Title t) {
        this.totalOfTime += t.getLengthInMinutes();
    }




}
