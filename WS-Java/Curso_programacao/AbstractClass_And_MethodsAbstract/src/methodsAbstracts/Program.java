package methodsAbstracts;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = input.nextInt();
        List<Shape> shapeList = new ArrayList<>();
        
        for (int x = 1; x < numberOfShapes+1; x++){
            System.out.println("Shape #" + x + " data:");
            System.out.print("Rectangle or Circle (R/C): ");
            String resp = input.next().toUpperCase().substring(0, 1);
            while (!(resp.equals("R") || resp.equals("C"))){
                System.out.println("Please send the correct value!!");
                resp = input.next().toUpperCase().substring(0, 1);
            }
            
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = input.next().toUpperCase();
            while (!(color.equals("BLACK") || color.equals("BLUE") || color.equals("RED"))){
                System.out.println("Please send the correct color!!");
                color = input.next().toUpperCase();
            }
            Color COLOR = Color.valueOf(color);

            if (resp.equals("R")){
                System.out.print("Width: ");
                double width = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                
                Shape rectangleShape = new Rectangle(COLOR, width, height);
                shapeList.add(rectangleShape);
            }
            else {
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                Shape circleShape = new Circle(COLOR, radius);
                shapeList.add(circleShape);
            }
        }

        System.out.println("SHAPE AREAS: ");

        for (Shape shape : shapeList){
            System.out.println(shape.area());
        }

        input.close();
    }
}
