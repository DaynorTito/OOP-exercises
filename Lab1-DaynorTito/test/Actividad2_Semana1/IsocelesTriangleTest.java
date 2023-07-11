package Actividad2_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsocelesTriangleTest {
    @Test
    public void testAreaPerimeter(){
        IsocelesTriangle isocelesTriangle = new IsocelesTriangle(8,8,4);
        assertEquals("\nIsocelesTriangle, \narea: "+String.format("%.2f", isocelesTriangle.getArea())+"\nperimeter: "+String.format("%.2f", isocelesTriangle.getPerimeter()),isocelesTriangle.toString(),"The triangle information does not match");
    }

}