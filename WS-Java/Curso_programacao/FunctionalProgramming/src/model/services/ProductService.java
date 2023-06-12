package model.services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService
{
    public double filterWithPredicate(List<Product> productList, Predicate<Product> filter)
    {
        double result = 0.0;
        for (int x = 0; x < productList.size(); x++){
            if (filter.test(productList.get(x))){
                result += productList.get(x).getPrice();
            }
        }
        return result;
    }
}
