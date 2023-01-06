package exercises.Class2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ArrayListPractice {
//    public static void main(String[] args){
//        ArrayList<Integer> evenArray=new ArrayList<>();
//        evenArray.add(1);
//        evenArray.add(2);
//        evenArray.add(3);
//        evenArray.add(4);
//        evenArray.add(5);
//        evenArray.add(6);
//        evenArray.add(7);
//        evenArray.add(8);
//        evenArray.add(9);
//        evenArray.add(10);
//        System.out.println("Initial array is: " + evenArray);
//
//        Integer totalSum = evenNumsSum(evenArray);
//        System.out.println("Sum of all the even numbers is: " + totalSum);
//    }

    public static Integer evenNumsSum(ArrayList<Integer> evenArray){
        int total =0;
        for(int i=0; i<evenArray.size();i++){
            if (evenArray.get(i) %2==0){
                total+=evenArray.get(i);
            }else{
                continue;
            }
        }
        return total;
    }

    public static void main (String... args){
        List<String> listOfWords = new ArrayList<>();
        String line="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] lineArray=line.split(" ");
//System.out.println(Arrays.toString(lineArray));
        listOfWords=Arrays.asList(lineArray);
        System.out.println(listOfWords);
        for(int i=0; i<listOfWords.size();i++){
            if(listOfWords.get(i).length()==5){
                System.out.println(listOfWords.get(i));
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters would you like to search for?");
        int howManyLetters=input.nextInt();
        for (int i=0; i<listOfWords.size();i++){
            if(listOfWords.get(i).length()==howManyLetters){
                System.out.println(listOfWords.get(i));
            }
        }
    }
}
