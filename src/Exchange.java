
public class Exchange {
    // Initialize all available compare
    public static Compare EUR = new Compare(1,0.9);
    public static Compare USD = new Compare(1,1);
    public static Compare ZL = new Compare(1.2,4.69);
    public static Compare UAH = new Compare(1.5,38);

    // Method to convert compare to other one
    public double convert(Compare from, Compare to, double amount){
        if (from == to)
            throw  new ArithmeticException("You cannot exchange the same compare");
        if (from == USD || to == USD)
            return  from == USD ? to.getPriceB()*amount : amount/from.getPriceS();
        return amount/from.getPriceS()*to.getPriceB();
    }

    public void Refresh_Prices(){
        double PriceEUR = 0.9;
        double PriceUSD = 1;
        double PriceUAH = 38;
        double PriceZL = 4.69;
        // Getting new prices from somewhere

        EUR.updatePrice(PriceEUR);
        USD.updatePrice(PriceUSD);
        UAH.updatePrice(PriceUAH);
        ZL.updatePrice(PriceZL);
    }

}
