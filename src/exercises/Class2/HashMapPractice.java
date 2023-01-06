package exercises.Class2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {
    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your student(or ENTER to finish): ");
        do {
            System.out.print("Student: ");
            newStudent=input.nextLine();
            if(!newStudent.equals("")){
                System.out.print("ID: ");
                Integer newID=input.nextInt();
                students.put(newStudent, newID);

                input.nextLine();
            }
        }while(!newStudent.equals(""));
        input.close();
        System.out.println("\nClass Roster:");
        for (Map.Entry<String, Integer> student : students.entrySet()){
            System.out.println(student.getKey()+ "'s ID: "+ student.getValue());
        }
        System.out.println("Number of students in roster: " + students.size());
    }

}
