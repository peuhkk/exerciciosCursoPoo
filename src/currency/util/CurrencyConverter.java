package currency.util;

public class CurrencyConverter {

    public static double dollarPrice;
    public static double dollarBought;

   public static Double value(){
       double value = dollarPrice * dollarBought;
       return value;
   }

    public static double IOF = 0.06;

   public static double finalValue(){
       return value() + (value() * IOF);
   }

}
