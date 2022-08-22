import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String UName;
    private HashMap<Compare,Double> hashMap = new HashMap<Compare, Double>();
    private int WalletId;

    public  User(String name){
        this.UName = name;
        this.WalletId = (int)Math.random()%1000;
    }

    public String getUName() {
        return UName;
    }

    public int getWalletId() {
        return WalletId;
    }
    public  void convert(Compare from, Compare to){
        hashMap.put(to,Exchange.getInstance().convert(from,to,this.hashMap.get(from)));
        hashMap.put(from,0.0);
    }
    public void Deposit(Compare compare, double amount){
        if (amount < 0)
            return;
        if (!hashMap.containsKey(compare)) {
            hashMap.put(compare, amount);
            return;
        }
        hashMap.put(compare,hashMap.get(compare) + amount);
    }
    public HashMap<Compare, Double> getHashMap() {
        return new HashMap<Compare, Double>(hashMap); //return copy because of security
    }
    public  void  Send(User recipient, Compare compare, double amount){
        if (amount < 0)
            return;
        if (amount > this.hashMap.get(compare)){
            System.out.println("Not enough balance");
            return;
        }
        recipient.hashMap.put(compare,amount);
        this.hashMap.put(compare,this.hashMap.get(compare) - amount);
    }

}
