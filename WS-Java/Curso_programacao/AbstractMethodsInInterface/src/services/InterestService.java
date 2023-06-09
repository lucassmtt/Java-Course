package services;

import java.security.InvalidParameterException;

public interface InterestService
{
    double getInterestRate();

    default double payment(double amount, int months)
    {
        if (months < 1){
            throw new InvalidParameterException("We cannot calculate whether months equals zero or one...");
        }
        return amount * Math.pow(100 + getInterestRate() / 100, months);
    }
}
