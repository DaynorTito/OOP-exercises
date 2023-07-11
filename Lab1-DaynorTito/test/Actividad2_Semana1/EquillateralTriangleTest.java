package Actividad2_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquillateralTriangleTest {

    @Test
    public void testData(){
        EquillateralTriangle equillateralTriangle = new EquillateralTriangle(7,7,7);
        assertEquals("\nEquillateralTriangle, \narea: "+String.format("%.2f", equillateralTriangle.getArea())+"\nperimeter: "+String.format("%.2f", equillateralTriangle.getPerimeter()),equillateralTriangle.toString(),"The triangle information doesn't match");
    }

}