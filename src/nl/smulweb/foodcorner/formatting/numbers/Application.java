package nl.smulweb.foodcorner.formatting.numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class Application {
   
   public static void main(String[] args) {
      double value = 3.141592653589;
      
      NumberFormat format = NumberFormat.getNumberInstance(Locale.FRANCE);
      
      System.out.println(format.format(value));
   }

}
