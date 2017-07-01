
import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        for (int x = index; x < array.length; x++) {
            if (array[x] < smallest) {
                smallest = array[x];
            }
        }
        int indexOfSmallest = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            
            
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            
        }
    }
}
