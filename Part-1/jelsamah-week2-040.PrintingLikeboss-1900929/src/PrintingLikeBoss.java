public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount > 0){
            System.out.print("*");
            amount--;
        }    
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        while(amount > 0){
            System.out.print(" ");
            amount--;
            }
        }

    public static void printTriangle(int size) {
        int counter = 1;
        while(size-counter >= 0){
            printWhitespaces(size-counter);
            printStars(counter);
            counter++;
        }
    }

    public static void xmasTree(int height) {
        //Printing the tree top
        int i = height - 2;
        int counter2 = 1;
        int counter3 = 0;
       while(height-counter2 >= 0){
            printWhitespaces(height-counter2);
            printStars(counter2+counter3);
            counter2++;
            counter3++;
        }
        
        //Printing the tree stand
        int counter = 2;
        while(counter > 0){
             printWhitespaces(i);
             printStars(3);
            counter--;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
