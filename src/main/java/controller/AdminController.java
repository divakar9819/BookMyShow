package controller;

import utilities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminController {

    public static Map<String, List<Movie>> releaseMovies(){
        //System.out.println("===============release");
        List<Movie> movies1 = new ArrayList<>();
        List<Movie> movies2 = new ArrayList<>();
        Map<String,List<Movie>> cityMoviesMap = new HashMap<>();

        Movie movie1 = new Movie("Avengers","180", MovieType.ACTION);
        Movie movie2 = new Movie("Bahubali","150", MovieType.COMEDY);
        Movie movie3 = new Movie("Golmal","130", MovieType.DRAMA);
        Movie movie4 = new Movie("Shidhat","140", MovieType.ROMANCE);
        movies1.add(movie1);
        movies1.add(movie2);
        movies2.add(movie3);
        movies2.add(movie4);

        cityMoviesMap.put("Noida",movies1);
        cityMoviesMap.put("Ghaziabad",movies2);

        //System.out.println(cityMoviesMap.size());
        return cityMoviesMap;

    }

    public static Map<String, List<Thearter>> assignMovieToThearter(String cityName,String movieName){
        Map<String, List<Thearter>>  movieThreater = new HashMap<>();
        List<Thearter> thearters = new ArrayList<>();

        Thearter thearter1 = new Thearter("Rajans",new Address("Noida","Gaur City Mall","201307"));
        Thearter thearter2 = new Thearter("Cinepolis Cinemas",new Address("Noida","The Grand Venice Mall","201303"));
        Thearter thearter3 = new Thearter("PVR",new Address("Ghaziabad","Raj Nagar Extension","201310"));
        Thearter thearter4 = new Thearter("Movie Times",new Address("Ghaziabad","Raj Nagar Extension","201310"));

        if(cityName.equalsIgnoreCase("noida")){
            thearters.add(thearter1);
            thearters.add(thearter2);
        }
        else {
            thearters.add(thearter3);
            thearters.add(thearter4);
        }

        movieThreater.put(movieName,thearters);

        return movieThreater;
    }
}
