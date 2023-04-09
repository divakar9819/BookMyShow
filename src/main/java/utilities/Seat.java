package utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seat {

    private String seatNumber;
    private boolean isBooked;
    private  Integer row;
    private Integer price;

    public static Map<String, List<Seat>> assignSeatToScreen(String screenNumber){
        Map<String , List<Seat>> screenSeat = new HashMap<>();
        List<Seat> seats = new ArrayList<>();
        seats.add(new Seat("A001",true,1,400));
        seats.add(new Seat("B001",true,1,400));
        seats.add(new Seat("C001",false,1,400));
        seats.add(new Seat("A002",false,2,350));
        seats.add(new Seat("B002",true,2,350));
        seats.add(new Seat("C002",true,2,350));
        seats.add(new Seat("A003",false,3,300));
        seats.add(new Seat("B003",true,3,300));
        seats.add(new Seat("C003",false,3,300));

        screenSeat.put(screenNumber,seats);
        return screenSeat;
    }

    public Seat() {

    }

    public Seat(String seatNumber, boolean isBooked, Integer row,Integer price) {
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
        this.row = row;
        this.price = price;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", isBooked=" + isBooked +
                ", row=" + row +
                ", price=" + price +
                '}';
    }
}
