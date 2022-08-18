import java.util.ArrayList;

public class User {
    private String UName;
    private ArrayList arrayList;
    private int WalletId;

    public  User(String name){
        this.UName = name;
        //this.WalletId = Math.random()%1000;
    }

    public String getUName() {
        return UName;
    }

    public int getWalletId() {
        return WalletId;
    }
    public  void convert(){

    }
}
