import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        User user = new User("Dima");
        user.Deposit(Exchange.BTC,100);
        User user1 = new User("Anton");
        System.out.println(Connection.getPrice("ETH"));
    }
}
