package Actividad2_Semana1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void testAreaPerimeter(){
        Square square = new Square(2);
        assertEquals("\nSquare, \narea: 4.00\nperimeter: 8.00",square.toString(),"area and perimeter do not coincide");

    }

}