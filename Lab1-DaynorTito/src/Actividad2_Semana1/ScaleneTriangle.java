package Actividad2_Semana1;

public class ScaleneTriangle extends Triangle{

    private int side;
    public ScaleneTriangle(){}
    public ScaleneTriangle(int side1, int side2, int side3) {
        super(side1,side2);
        side = side3;
    }
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }



    @Override
    public double getPerimeter() {
        return super.getHeight()+super.getBase()+this.side;
    }

    @Override
    public double getArea() {
        double semiperimeter = (super.getBase() + super.getHeight() + this.side) / 2;
        double area = Math.sqrt(semiperimeter * (semiperimeter - super.getBase()) * (semiperimeter - super.getHeight()) * (semiperimeter - this.side));
        return area;
    }

    @Override
    public String toString() {
        return "\nScaleneTriangle, \narea: "+String.format("%.2f", getArea())+"\nperimeter: "+String.format("%.2f", getPerimeter());
    }
}
