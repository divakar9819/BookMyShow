package utilities;

import java.util.List;

public class Ticket {

    private Integer ticketId;
    private Integer price;


    public static void generateTicket(String cityName , String movieName , String thearterName,String screenNumber,String seatNumber){

        List<Seat> seats = Screen.displaySeat(cityName,movieName,thearterName,screenNumber);
        if(seats!=null){
            Boolean booked = false;
            for(Seat s : seats){
                if(s.getSeatNumber().equalsIgnoreCase(seatNumber) && s.isBooked()==false){
                    s.setBooked(true);
                    booked = true;
                    System.out.println("Ticket booket successfully");
                    break;
                }
            }

            if(!booked){
                System.out.println("All seat is booked");
            }

            System.out.println(seats);
        }
        else {
            System.out.println("Sorry no seat is available");
        }
    }

    public static void main(String[] args) {
        generateTicket("Noida","Avengers","Rajans","S101","C001");
    }

    public Ticket(Integer ticketId, Integer price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
