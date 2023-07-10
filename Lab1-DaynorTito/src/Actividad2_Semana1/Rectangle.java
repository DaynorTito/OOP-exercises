package Actividad2_Semana1;

import java.util.Objects;

public class Rectangle implements Figure{

    private int base;
    private int height;

    public Rectangle(){}

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return base == rectangle.base && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }

    @Override
    public double getArea() {
        return base*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(base+height);
    }
    public String toString() {
        return "\nRectangle, \narea: "+String.format("%.2f", getArea())+"\nperimeter: "+String.format("%.2f", getPerimeter());
    }
}
