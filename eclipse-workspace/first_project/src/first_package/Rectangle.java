package first_package;

public class Rectangle extends GeometricalShape{
    private double length, width;
    public Rectangle(double x, double y, double length, double width){
        posX = x;
        posY = y;
        this.length = length;
        this.width = width;
    }

    @Override 
    public double surface(){
        return length * width;
    }

    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
}


