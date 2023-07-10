package Actividad2_Semana1;

public class Square extends Rectangle{

    public Square(int side){
        super(side,side);
    }
    @Override
    public String toString() {
        return "\nSquare, \narea: "+String.format("%.2f", getArea())+"\nperimeter: "+String.format("%.2f", getPerimeter());
    }
}
