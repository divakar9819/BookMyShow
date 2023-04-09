package controller;

import utilities.City;
import utilities.Movie;
import utilities.Thearter;

public class BookMyShowController {

    public static  void findMovies(String cityName){
//        City.displayAllMovie(cityName);
//        Movie.displayThearter(cityName,"Avengers");
    }

    public static void bookMovie(String cityName){
        City.displayAllMovie(cityName);
        Movie.displayThearter(cityName,"Avengers");
        Thearter.displayScreen(cityName,"Avengers" ,"Rajans");
    }

    public static void main(String[] args) {
        System.out.println("***** Welcome to BookMyShow *****");
        bookMovie("noida");
    }
}
