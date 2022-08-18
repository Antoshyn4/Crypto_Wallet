
public class Program {
    public static void main(String[] args) {
        User user = new User("Dima");
        user.Deposit(Exchange.USD,100);
        //user.convert(Exchange.USD,Exchange.EUR);
        User user1 = new User("Anton");
        user.Send(user1,Exchange.USD,user.getHashMap().get(Exchange.USD)*0.6);
        System.out.println(user.getHashMap().values());
        System.out.println(user1.getHashMap().values());
        }
}
