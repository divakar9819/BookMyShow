package utilities;

import controller.AdminController;

import java.util.List;
import java.util.Map;

public class City {

    private String cityName;
    private static List<Movie> movieList;
    private static Map<String,List<Movie>> cityMovies;

    public static List<Movie> displayAllMovie(String city){
        System.out.println("Movie List");
        cityMovies = AdminController.releaseMovies();
        for(Map.Entry<String,List<Movie>> m : cityMovies.entrySet()){
            String cityName = m.getKey();
            //System.out.println(cityName);
            if(cityName.equalsIgnoreCase(city)){
               // System.out.println(city);
                movieList = m.getValue();
            }
        }


        if(movieList!=null){
            for(Movie movie : movieList){
                System.out.println("Movies : "+movie.getName()+" , "+movie.getDuration()+" , "+movie.getType());
            }
        }
        else {
            System.out.println("Sorry there is no movie available right now");
        }

        return  movieList;

    }





}
