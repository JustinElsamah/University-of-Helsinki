/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justinelsamah
 */
import java.util.*;

public class UserInput {

   
    public static ArrayList<Integer> inputNumbersIntoArrayList(Scanner reader) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        int temp = 0;
        while (temp != -1) {
            temp = Integer.parseInt(reader.nextLine());
            if (0<temp && temp<61) {
                grades.add(temp);
            }
        }
        
        return grades;
    }

    
}
