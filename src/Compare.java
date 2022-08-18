public class Compare {
    private  double priceS;
    private  double price;
    private double commission;
    private  double priceB;

    public Compare(double commission, double price) {
        this.commission = commission;
        this.price = price;
        this.priceS = this.price + price*commission/100;
        this.priceB = price - price*commission/100;
    }

    public double getPriceB() {
        return priceB;
    }

    public double getPriceS() {
        return priceS;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (this.toString() != "USD")
            this.price = price;
    }

    public void setCommission(double commission) {
        this.commission = commission;
        this.priceS = this.price + this.price*commission/100;
        this.priceB = this.price - this.price*commission/100;
    }

    public  void updatePrice(double Newp){
        if (Newp > 0) // Some additional logic
            this.setPrice(Newp);
    }

    public  void  UpdateSpread(double spread){
        if (spread >= 0) // Some additional logic
            this.setCommission(spread);
    }
}
