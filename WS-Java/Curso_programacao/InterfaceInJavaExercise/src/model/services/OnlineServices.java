package model.services;

import java.util.List;

public interface OnlineServices
{
    List<Double> tax_portion(double value, int portions);
}
