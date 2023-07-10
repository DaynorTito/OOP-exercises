package QuadrantSelection;

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        //Quadrant Selection
        int xCoordinate, yCoordinate;
        Scanner sc =  new Scanner(System.in);
        xCoordinate = sc.nextInt();
        yCoordinate = sc.nextInt();
        if(xCoordinate>0 && yCoordinate>0)
            System.out.println(1);
        else if(xCoordinate<0 && yCoordinate>0)
            System.out.println(2);
        else if(xCoordinate<0 && yCoordinate<0)
            System.out.println(3);
        else if(xCoordinate>0 && yCoordinate<0)
            System.out.println(4);
    }
}