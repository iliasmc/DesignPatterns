package Creational.Singleton;

public class CurrencyConverter {

    private double dollarToEuroRate = 1.3;

    private static CurrencyConverter instance = new CurrencyConverter();

    /**
     * Private to prevent that any client can directly instantiate this class
     */
    private CurrencyConverter(){}

    public static CurrencyConverter getInstance(){
        return instance;
    }

    public double dollarToEuro(double dollar){
        return dollarToEuroRate * dollar;
    }

    public void setDollarToEuroRate(double dollarToEuroRate){
        this.dollarToEuroRate = dollarToEuroRate;
    }

}
