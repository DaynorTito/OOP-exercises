package Actividad2_Semana1;

public class IsocelesTriangle extends Triangle{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public IsocelesTriangle(){}
    public IsocelesTriangle(int side1, int side2, int side3) {
        super(side1,side2);
        side = side3;
    }

    @Override
    public double getPerimeter() {
        return super.getHeight()+super.getBase()+this.side;
    }

    @Override
    public double getArea() {
        double semiper = (super.getHeight() + super.getBase() + this.side) / 2;
        double area = Math.sqrt(semiper * (semiper - super.getHeight()) * (semiper - super.getBase()) * (semiper - this.side));
        return area;
    }

    @Override
    public String toString() {
        return "\nIsocelesTriangle, \narea: "+String.format("%.2f", getArea())+"\nperimeter: "+String.format("%.2f", getPerimeter());
    }
}
