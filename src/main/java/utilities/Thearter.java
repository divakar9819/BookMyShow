package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Thearter {

    private String name;
    private Address address;

    public static List<Screen> displayScreen(String cityName , String movieName , String thearterName){
        System.out.println("*****Screen*****");
        //call assignScreenToThearter method
        //method to get all therater name
        List<Thearter> thearters = Movie.displayThearter(cityName,movieName);
        Boolean flag = false;
        if(thearters!=null){
            for(Thearter th: thearters){
                if(th.getName().equalsIgnoreCase(thearterName)){
                    flag = true;
                    break ;
                }
            }
        }
        else {
            System.out.println("Sorry no thearter available");
        }

        if(flag){
            Map<String, List<Screen>> screens = Screen.assignScreenToThearter(thearterName);
            List<Screen> screen = new ArrayList<>();
            for(Map.Entry<String,List<Screen>> thScreen: screens.entrySet()){
                screen = thScreen.getValue();
            }

            if(screen!=null){
                for(Screen sc : screen){
                    System.out.println(sc);
                }
                return screen;
            }
            else {
                System.out.println("Sorry no screen is available");
                return null;
            }
        }
        else {
            System.out.println("No movie available in this "+thearterName);
            return null;
        }

    }

    public Thearter(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}


