package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key = null;
        while ((key = reader.readLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;
            switch (key) {
                case "soapOpera":
                    movie = new SoapOpera();
                    break;
                case "cartoon":
                    movie = new Cartoon();
                    break;
                case "thriller":
                    movie = new Thriller();
                    break;
            }
            return movie;
        }
    }

    public static class Movie {
    }

    public static class SoapOpera extends Movie {
    }

    public static class Cartoon extends Movie {

    }

    public static class Thriller extends Movie {

    }
}
