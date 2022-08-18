
public class Program {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        exchange.UAH.setSpread(1.5);
        System.out.println(exchange.convert(exchange.USD,exchange.UAH,100));
        exchange.UAH.setSpread(0);
        System.out.println(exchange.convert(exchange.USD,exchange.UAH,100));
        System.out.println(exchange.convert(exchange.EUR,exchange.UAH,exchange.convert(exchange.UAH,exchange.EUR,100)));
        exchange.UAH.setSpread(3);
        System.out.println(exchange.convert(exchange.EUR,exchange.UAH,exchange.convert(exchange.UAH,exchange.EUR,100)));
    }
}
