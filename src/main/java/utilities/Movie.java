package utilities;

import controller.AdminController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {

    private String name;
    private String duration;
    private MovieType type;


    public static List<Thearter> displayThearter(String cityName , String movieName){
        System.out.println("*****Threater*****");
        List<Movie> movies = City.displayAllMovie(cityName);
        Map<String, List<Thearter>> movieThreaters = new HashMap<>();
        List<Thearter> thearters = new ArrayList<>();
        if(movies!=null){
            for(Movie movie : movies ){
                if(movie.getName().equalsIgnoreCase(movieName)){
                    // displayThearter
                    movieThreaters = AdminController.assignMovieToThearter(cityName,movieName);

                    for(Map.Entry<String,List<Thearter>> mth : movieThreaters.entrySet()){
                        thearters = mth.getValue();

                    }
                }
            }
        }


        if(thearters!=null){
            for(Thearter th : thearters){
                System.out.println("Threaters : "+th.getName()+","+th.getAddress());
            }

            return thearters;
        }
        else {
            System.out.println("Sorry no thearter available");
            return null;
        }
    }


    public Movie(String name, String duration, MovieType type) {
        this.name = name;
        this.duration = duration;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public MovieType getType() {
        return type;
    }

    public void setType(MovieType type) {
        this.type = type;
    }
}
