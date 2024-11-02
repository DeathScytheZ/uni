package first_package;

abstract public class GeometricalShape {
    abstract public double surface();
    abstract public double perimeter();
    protected double posX, posY;
    public void translate(double x, double y){
        posX += x;
        posY += y;
    }

    public void showPosition(){
        System.out.println("Position: " + "(" + posX + " ," + posY + ")");
    }

}