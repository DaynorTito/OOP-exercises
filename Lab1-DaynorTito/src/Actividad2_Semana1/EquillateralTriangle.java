package Actividad2_Semana1;

public class EquillateralTriangle extends Triangle{
    private int side;
    public EquillateralTriangle(){}
    public EquillateralTriangle(int side1, int side2, int side3) {
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
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public String toString() {
        return "\nEquillateralTriangle, \narea: "+String.format("%.2f", getArea())+"\nperimeter: "+String.format("%.2f", getPerimeter());
    }
}
