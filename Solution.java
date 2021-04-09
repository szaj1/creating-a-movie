package com.codegym.task.task14.task1414;

/* 
MovieFactory

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write movie type you want to create: thriller or soap opera or cartoon");
        String type = scan.nextLine();
        while (true) {
            Movie movie = MovieFactory.getMovie(type);

            if (type.equals("thriller") || type.equals("soap opera") || type.equals("cartoon")) {
                System.out.println(movie.getClass().getSimpleName());
                type = scan.nextLine();
            } else {
                scan.close();
                break;
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String type) {
            Movie movie = null;

            if ("soap opera".equals(type)) {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(type)){
                movie = new Cartoon();
            }
            else if ("thriller".equals(type)){
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {}
    static class Cartoon extends Movie {}
    static class Thriller extends Movie {}
}
