package Actividad2_Semana1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(15,7);
        System.out.println(rectangle.toString());

        Square square = new Square(2);
        System.out.println(square.toString());

        Triangle triangle = new Triangle(5,9);
        System.out.println(triangle.toString());
        EquillateralTriangle equillateralTriangle = new EquillateralTriangle(7,7,7);
        System.out.println(equillateralTriangle.toString());

        ScaleneTriangle scaleneTriangle = new ScaleneTriangle(8,7,3);
        System.out.println(scaleneTriangle.toString());

        IsocelesTriangle isocelesTriangle = new IsocelesTriangle(8,8,4);
        System.out.println(isocelesTriangle.toString());


    }
}
