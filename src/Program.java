
public class Program {
    public static void main(String[] args) {
        User user = new User("Dima");
        user.Deposit(Exchange.USD,100);
        user.convert(Exchange.USD,Exchange.EUR);
        System.out.println(user.getHashMap().values());
        }
}
