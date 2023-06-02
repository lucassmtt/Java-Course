package IOSTREAM;

import java.io.Serializable;

public class Dog implements Serializable{

    String name;
    String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getBreed(){return breed;}

    public void setBreed(String breed){this.breed = breed;}
}