package model.entities;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Reservation {
    Integer roomNumber;
    Date checkin;
    Date checkout;
    public Calendar calendarIN = new GregorianCalendar();
    public Calendar calendarOUT = new GregorianCalendar();

    public Reservation(){}

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
        calendarIN.setTime(checkin);
        calendarOUT.setTime(checkout);
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

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Integer duration(){
        int day_Checkin = calendarIN.get(Calendar.DAY_OF_MONTH);
        int month_Checkin = calendarIN.get(Calendar.MONTH);
        int year_Checkin = calendarIN.get(Calendar.YEAR);

        int day_Checkout = calendarOUT.get(Calendar.DAY_OF_MONTH);
        int month_Checkout = calendarOUT.get(Calendar.MONTH);
        int year_Checkout = calendarOUT.get(Calendar.YEAR);

        System.out.println(day_Checkin + "/" + month_Checkin + "/" + year_Checkin);
        System.out.println(day_Checkout + "/" + month_Checkout + "/" + year_Checkout);
        if (year_Checkin <= year_Checkout){
            System.out.println("Year ok");
            if (month_Checkin <= month_Checkout){
                System.out.println("month ok");
                if (day_Checkin < day_Checkout){
                    System.out.println("day ok");
                    return day_Checkout - day_Checkin;
                }
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return calendarIN.get(Calendar.YEAR) + "-" + calendarOUT.get(Calendar.YEAR);
    }
}
