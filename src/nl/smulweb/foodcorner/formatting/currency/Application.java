package nl.smulweb.foodcorner.formatting.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class Application {
   
   public static void main(String[] args) {
      
      double value = 3.14152653589;
      
      NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
      
      System.out.println(formatter.format(value));
      
   }

}
