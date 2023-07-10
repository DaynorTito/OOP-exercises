package Actividad2_Semana1;

import java.util.Objects;

public class Triangle implements Figure{
    private int base;
    private int height;
    public Triangle(){}

    public Triangle(int base, int height) {
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
        Triangle triangle = (Triangle) o;
        return base == triangle.base && height == triangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }

    @Override
    public double getArea() {
        return (base*height)/2;
    }

    @Override
    public double getPerimeter() {
        return height+base;
    }

    @Override
    public String toString() {
        return "\nTriangle, \narea: "+String.format("%.2f", getArea())+"\nperimeter: "+String.format("%.2f", getPerimeter());
    }
}
