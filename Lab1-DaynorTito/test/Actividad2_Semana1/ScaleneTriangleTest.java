package Actividad2_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaleneTriangleTest {

    @Test
    public void testAreaPerimeterScaleneTriangle(){
        ScaleneTriangle scaleneTriangle = new ScaleneTriangle(8,7,3);
        assertEquals("\nScaleneTriangle, \narea: "+String.format("%.2f", scaleneTriangle.getArea())+"\nperimeter: "+String.format("%.2f", scaleneTriangle.getPerimeter()),scaleneTriangle.toString(),"The triangle information does not match");
    }

}