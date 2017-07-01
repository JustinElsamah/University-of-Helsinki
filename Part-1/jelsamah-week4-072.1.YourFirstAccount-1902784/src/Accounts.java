
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {

        Account justinsAccount = new Account("Justin", 100.0);
        justinsAccount.deposit(20);
        System.out.println(justinsAccount);

    }

}
