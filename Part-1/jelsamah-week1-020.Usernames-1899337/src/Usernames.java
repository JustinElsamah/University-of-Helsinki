
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String User = reader.nextLine();
        System.out.println("Type your password: ");
        String Pass = reader.nextLine();
        
        if(User.equals("alex")){
            if(Pass.equals("mightyducks")){
                System.out.println("You are now logged into the system!");
            }else{
                System.out.println("Your username or password was invalid!");
            }
        }else if(User.equals("emily")){
            if(Pass.equals("cat")){
                System.out.println("You are now logged into the system!");
            }else{
                System.out.println("Your username or password was invalid!");
            }
        }else{
                System.out.println("Your username or password was invalid!");
        }
    
    }
}
