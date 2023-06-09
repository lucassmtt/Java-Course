package services;


import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService
{
    public double interestRate;

    public UsaInterestService(){}
    public UsaInterestService(double interestRate){this.interestRate = interestRate;}

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
