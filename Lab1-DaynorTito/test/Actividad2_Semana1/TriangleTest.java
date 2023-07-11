package Actividad2_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    public void testAreaPerimeter(){
        Triangle triangle = new Triangle(5,9);
        assertEquals("\nTriangle, \narea: "+String.format("%.2f", triangle.getArea())+"\nperimeter: "+String.format("%.2f", triangle.getPerimeter()),triangle.toString(),"area and perimeter do not coincide");
    }

}