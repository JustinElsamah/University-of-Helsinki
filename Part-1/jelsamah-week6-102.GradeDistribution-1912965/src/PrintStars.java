/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justinelsamah
 */
public class PrintStars {
  
    public static void printArrayAsStars(int[] array) {
        System.out.println("Grade distribution:");
        for(int i = array.length-1; i >= 0; i--){
            System.out.print( i + ": ");
            printStars(array[i]);
        }
    }
    public static void printStars(int stars){
        for(int i = 0; i < stars; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
