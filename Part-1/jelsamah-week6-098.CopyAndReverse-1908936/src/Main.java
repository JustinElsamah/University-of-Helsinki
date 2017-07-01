

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] original){
        int[] copy = new int[original.length];
        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }
    return copy;
    }
    
    public static int[] reverseCopy(int[] original){
        int[] reverseCopy = new int[original.length];
        int i = original.length-1;
        int x = 0;
        while(i>=0){
            reverseCopy[x]=original[i];
            i--;
            x++;
        }
    return reverseCopy;
    }
    
}
