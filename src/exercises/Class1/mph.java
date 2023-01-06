package exercises.Class1;
import java.util.Scanner;
public class mph {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive:");
        Double miles = input.nextDouble();

        System.out.println("How much gas did you use? In gallons.");
        Double gas = input.nextDouble();

        Double mpg = miles / gas;

        System.out.println("You are running on " +mpg+ " mpg.");
    }
}
