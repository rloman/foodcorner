package nl.smulweb.foodcorner.formatting.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Application {
   
   public static void main(String[] args) {
      LocalDate now = LocalDate.now();
      
      String formatString = now.format(DateTimeFormatter.ISO_DATE);
      
      System.out.println(formatString);
      
      formatString = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
      
      System.out.println(formatString);
      
      System.out.println(now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
      
      
   }

}
