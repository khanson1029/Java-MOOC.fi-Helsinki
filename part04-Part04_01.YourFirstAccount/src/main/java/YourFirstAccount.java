
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("Kyle's account", 100.0);
        account.deposit(20.0);
        System.out.println(account);

    }
}
