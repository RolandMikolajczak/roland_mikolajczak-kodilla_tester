package com.kodilla;

public class SimplayArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
                movies[0] = "RocknRolla";
        movies[1] = "Snatch";
        movies[2] = "Sherlock Holmes";
        movies[3] = "Sherlock Holmes Game of Shadows";
        movies[4] = "Revolver";

        String movie = movies[3];
        System.out.println(movie);
        int numberOfElements = movies.length;
        System.out.println("Moja tablica zawiera "+numberOfElements+" elementow");




    }
}
