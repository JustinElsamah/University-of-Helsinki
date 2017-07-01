
public class Accounts {

    public static void main(String[] args) {
        Account MattsAccount = new Account("Matt's account", 1000);
        Account MyAccount = new Account("My account", 0);
        MattsAccount.withdrawal(100);
        MyAccount.deposit(100);
        System.out.println(MattsAccount);
        System.out.println(MyAccount);
    }

}
