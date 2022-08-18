
public class Exchange {
    // Initialize all available compare
    public static Compare BTC = new Compare(1,0.9);
    public static Compare ETH = new Compare(1,1);
    public static Compare SOL = new Compare(1,4.69);
    public static Compare NEAR = new Compare(1,38);

    // Method to convert compare to other one
    public double convert(Compare from, Compare to, double amount){
        if (from == to)
            throw  new ArithmeticException("You cannot exchange the same compare");
        return amount/from.getPrice()*to.getPrice()*(1-from.getCommission()/100);
    }

    public void Refresh_Prices(){
        double PriceETH = 0.9;
        double PriceBTC = 1;
        double PriceSOL = 38;
        double PriceNEAR = 4.69;
        // Getting new prices from somewhere

        ETH.updatePrice(PriceETH);
        BTC.updatePrice(PriceBTC);
        SOL.updatePrice(PriceSOL);
        NEAR.updatePrice(PriceNEAR);
    }

}
