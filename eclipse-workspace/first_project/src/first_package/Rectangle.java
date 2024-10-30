package first_package;

public class Rectangle extends GeometricalShape{
    double length, width;
    public Rectangle(double x, double y, double length, double width){
        posX = x;
        posY = y;
        this.length = length;
        this.width = width;
    }

    double surface(){
        return length * width;
    }

    double perimeter(){
        return 2 * (length + width);
    }
}
