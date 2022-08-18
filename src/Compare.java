public class Compare {
    private  double priceS;
    private  double price;
    private double spread;
    private  double priceB;

    public Compare(double spread, double price) {
        this.spread = spread;
        this.price = price;
        this.priceS = this.price + price*spread/100;
        this.priceB = price - price*spread/100;
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

    public void setSpread(double spread) {
        this.spread = spread;
        this.priceS = this.price + this.price*spread/100;
        this.priceB = this.price - this.price*spread/100;
    }

    public  void updatePrice(double Newp){
        if (Newp > 0) // Some additional logic
            this.setPrice(Newp);
    }

    public  void  UpdateSpread(double spread){
        if (spread >= 0) // Some additional logic
            this.setSpread(spread);
    }
}
