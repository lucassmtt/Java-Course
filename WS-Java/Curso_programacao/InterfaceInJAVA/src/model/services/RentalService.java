package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService
{
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


    public void processInvoice(CarRental carRental)
    {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basic_payment;

        if (hours <= 12){
            basic_payment = pricePerHour * Math.ceil(hours);
        }
        else {
            basic_payment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax_payment = taxService.tax(basic_payment);

        carRental.setInvoice(new Invoice(basic_payment, tax_payment));
    }
}
