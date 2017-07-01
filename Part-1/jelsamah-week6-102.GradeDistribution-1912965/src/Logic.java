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

public class Logic {

    

    public static int[] convertArrayListToArray(ArrayList<Integer> grades2) {
        int[] grades = new int[6];
        for (int grade : grades2) {
            if (0 < grade && grade < 30) {
                grades[0]++;
            } else if (29 < grade && grade < 35) {
                grades[1]++;
            } else if (34 < grade && grade < 40) {
                grades[2]++;
            } else if (39 < grade && grade < 45) {
                grades[3]++;
            } else if (44 < grade && grade < 50) {
                grades[4]++;
            } else if (49 < grade || grade < 61) {
                grades[5]++;
            }

        }
        return grades;

    }

    public static void percentageCalculation(ArrayList<Integer> grades2) {
        int correct = 0;
        int total = 0;
        System.out.print("Acceptance Percentage: ");
        for (int grade : grades2) {
            
            total++;
            if (29 < grade && grade < 61) {
                correct++;
            } 
        }

        System.out.println((double)correct/total * 100.0);
    }
}
