package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>
{
    private List<T> list = new ArrayList<T>();
    public void addValue(T value)
    {
        list.add(value);
    }

    public T first()
    {
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void printer()
    {
        System.out.print("[" + list + "]");
    }
}