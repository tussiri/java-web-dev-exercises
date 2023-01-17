package Studios.Class1.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the radius: ");
        Double rad = input.nextDouble();

        double pi = 3.14;
//        double area = pi * ( rad * rad);
        Double area = Circle.getArea(rad);

        System.out.println("The area of a circle with radius "+ rad + " is: " + area +".");

    }
}
