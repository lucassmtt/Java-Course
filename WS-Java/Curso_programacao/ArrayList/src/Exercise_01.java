import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.stream.Collectors;

public class Exercise_01 {
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        myList.add(2, 100);
        for (Integer x : myList){
            System.out.println(x);
        }

        System.out.println("---------------------");
        myList.removeIf(x -> x.equals(30));

        for (Integer x : myList){
            System.out.println(x);
        }

        List<String> otherList = new ArrayList<>();
        otherList.add("Maria");
        otherList.add("Joao");
        otherList.add("Gabriel");
        otherList.add("Jose");

        List<String> result = otherList.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        System.out.println("----------------------------");
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("----------------------------");

        String first_name_with_J = otherList.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(first_name_with_J);
    }
}

