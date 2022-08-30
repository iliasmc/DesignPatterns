package Creational.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        CurrencyConverter converter = CurrencyConverter.getInstance();
        System.out.println(converter.dollarToEuro(1));
        converter.setDollarToEuroRate(4.0);

        CurrencyConverter sameConverter = CurrencyConverter.getInstance();
        System.out.println(sameConverter.dollarToEuro(1));

    }
}
