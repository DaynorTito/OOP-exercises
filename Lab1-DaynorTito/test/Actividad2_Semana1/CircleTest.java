package Actividad2_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void testAreaPerimeter(){
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483,circle.getArea(),"The area of the circle doesn't match");
        assertEquals(31.41592653589793,circle.getPerimeter(),"The Perimeter of the circle doesn't match");
    }
}