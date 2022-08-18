import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String UName;
    private HashMap<Compare,Double> hashMap;
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
    public  void convert(){

    }
    public void Deposit(Compare compare, double amount){
        if (amount < 0)
            return;
        if (!hashMap.containsKey(compare))
            hashMap.put(compare,amount);
        hashMap.put(compare,hashMap.get(compare) + amount);
    }
}
