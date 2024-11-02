package first_package;

public class Circle extends GeometricalShape{
    private double radius;
    Circle(double x, double y, double radius){
        posX = x;
        posY = y;
        this.radius = radius;
    }

    @Override
    public double surface(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter(){
        return 2 * radius *Math.PI;
    }
}
