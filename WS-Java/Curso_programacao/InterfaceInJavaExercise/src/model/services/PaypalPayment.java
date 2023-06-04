package model.services;

import java.util.ArrayList;
import java.util.List;

public class PaypalPayment implements OnlineServices
{
    public PaypalPayment(){};
    public List<Double> tax_portion(double value, int portions){
        ArrayList<Double> every_portions = new ArrayList<Double>();
        for (int x = 1; x<portions+1; x++){
            double portion_per_month = value / portions;
            portion_per_month += portion_per_month / 100 * x;
            portion_per_month += portion_per_month / 100 * 2; // this is the value of tax month
            every_portions.add(portion_per_month);
        }
        return every_portions;
    }
}