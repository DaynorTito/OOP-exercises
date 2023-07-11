package Actividad2_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void testAreaPerimeter(){
        Rectangle rectangle = new Rectangle(15,7);
        assertEquals("\nRectangle, \n" + "area: 105.00\n" +"perimeter: 44.00",rectangle.toString(),"Area and Perimeter don't match");
    }

}