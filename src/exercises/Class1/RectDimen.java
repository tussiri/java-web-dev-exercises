package exercises.Class1;

import java.util.Scanner;

public class RectDimen {
        public static void main(String[] args){
            Scanner inputLen = new Scanner(System.in);
            System.out.println("What is the length of the rectangle:");
            int length = inputLen.nextInt();

            Scanner inputWid = new Scanner(System.in);
            System.out.println("What is the width of the rectangle:");
            int width = inputWid.nextInt();

            int area = length * width;
            System.out.println("The area of the rectangle is " + area + ".");

        }
    }
