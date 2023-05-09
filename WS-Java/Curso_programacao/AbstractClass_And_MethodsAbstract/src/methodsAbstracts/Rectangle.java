package methodsAbstracts;

public class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(){}
    Rectangle(Color color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return height * width;
    }
}
