
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void name() {
        System.out.println("name: ");
    }

    public static void number() {
        System.out.println("studentnumber: ");
    }

    public static void main(String[] args) {
        String number;
        String name;
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        name();
        name = reader.nextLine();
        while (!name.isEmpty()) {
            number();
            number = reader.nextLine();
            students.add(new Student(name, number));
            name();
            name = reader.nextLine();

        }
        
        for(Student stud1: students){
            System.out.println(stud1);
        }
        
        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for(Student stud2: students){
            if(stud2.getName().contains(search)){
                System.out.println(stud2);
            }
        }
    }
}
