public class Compare {
    private  double price;
    private double commission;

    public Compare(double commission, double price) {
        this.commission = commission;
        this.price = price;
    }

    public double getCommission() {
        return commission;
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
