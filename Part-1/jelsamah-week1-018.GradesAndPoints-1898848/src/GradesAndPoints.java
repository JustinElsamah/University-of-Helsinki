
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int num1 = Integer.parseInt(reader.nextLine());
        String grade;
        if(0 < num1 && num1 < 30){
            grade = "failed";
            System.out.println("Grade: " + grade);
        }else if(29 < num1 && num1 < 35){
            grade = "1";
            System.out.println("Grade: " + grade);
        }else if(34 < num1 && num1 < 40){
            grade = "2";
            System.out.println("Grade: " + grade);
        }else if(39 < num1 && num1 < 45){
            grade = "3";
            System.out.println("Grade: " + grade);
        }else if(44 < num1 && num1 < 50){
            grade = "4";
            System.out.println("Grade: " + grade);
        }else if(49 < num1 || num1 < 61){
            grade = "5";
            System.out.println("Grade: " + grade);
        }
    }
}