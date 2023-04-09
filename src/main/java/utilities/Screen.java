package utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen {

    private String screenNumber;
    private String showTime;

   // Map<Thearter, List<Screen>> thearterScreen  = new HashMap<>();


    public static Map<String, List<Screen>> assignScreenToThearter(String thearterName){
        Map<String, List<Screen>> thearterScreen  = new HashMap<>();
        List<Screen> thearterScreen1 = new ArrayList<>();
        thearterScreen1.add(new Screen("S101","8:45 PM"));
        thearterScreen1.add(new Screen("S102","9:45 PM"));
        thearterScreen1.add(new Screen("S103","8:45 AM"));
        thearterScreen1.add(new Screen("S104","10:45 AM"));
        thearterScreen.put(thearterName,thearterScreen1);
        return  thearterScreen;

    }

    public static  List<Seat> displaySeat(String cityName , String movieName , String thearterName,String screenNumber){
        System.out.println("*****Seat*****");
        List<Screen> screens = Thearter.displayScreen(cityName,movieName,thearterName);
        boolean flag = false;
        for(Screen sc : screens){
            if(sc.screenNumber.equalsIgnoreCase(screenNumber)){
                flag = true;
                break;
            }
        }
        if(flag){
            Map<String,List<Seat>> screenSeat = Seat.assignSeatToScreen(screenNumber);
            List<Seat> seats = new ArrayList<>();
            for(Map.Entry<String,List<Seat>> ss: screenSeat.entrySet()){
                seats = ss.getValue();
            }

            if(seats!=null){
                System.out.println("*****Seats details*****");{
                    for(Seat seat : seats){
                        System.out.println("Seat details: "+seat.getSeatNumber()+","+seat.getRow()+","+seat.isBooked());
                    }
                    return seats;
                }
            }
            else {
                System.out.println("Sorry no seat is available now");
                return null;
            }
        }
        else {
            System.out.println("Sorry no screen is available now");
            return null;
        }

    }

//    public static void main(String[] args) {
//        displaySeat("Noida","Avengers","Rajans","S101");
//    }


    public Screen(String screenNumber, String showTime) {
        this.screenNumber = screenNumber;
        this.showTime = showTime;
    }

    public String getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(String screenNumber) {
        this.screenNumber = screenNumber;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenNumber='" + screenNumber + '\'' +
                ", showTime='" + showTime + '\'' +
                '}';
    }
}
