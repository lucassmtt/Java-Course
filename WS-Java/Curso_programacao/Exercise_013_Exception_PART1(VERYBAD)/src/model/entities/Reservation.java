package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    public Integer roomNumber;
    public Date checkin;
    public Date checkout;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Reservation(){}
    public Reservation(Integer roomNumber, Date checkin, Date checkout){
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }


    public Date getCheckout() {
        return checkout;
    }


    public long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date newCheckin, Date newCheckout){
        this.checkin = newCheckin;
        this.checkout = newCheckout;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Roomnumber " + roomNumber +
                ", check-in " + sdf.format(checkin) +
                ", check-out " + sdf.format(checkout) ;
    }
}
