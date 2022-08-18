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
        Exchange exchange = new Exchange();
        hashMap.put(to,exchange.convert(from,to,this.hashMap.get(from)));
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
}
