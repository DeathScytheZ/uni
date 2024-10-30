package first_package;

abstract public class GeometricalShape {
    abstract double surface();
    abstract double perimeter();
    double posX, posY;
    public void translate(double x, double y){
        posX += x;
        posY += y;
    }

    public void showPosition(){
        System.out.println("Position: " + "(" + posX + " ," + posY + ")");
    }

}