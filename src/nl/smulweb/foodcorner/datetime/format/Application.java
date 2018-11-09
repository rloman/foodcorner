package nl.smulweb.foodcorner.datetime.format;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Application {
   
   public static void main(String[] args) {
      
      ZonedDateTime now = ZonedDateTime.now();
      
      System.out.println(now);
      
      
      //iso8601 with millis
      System.out.println(now.format(DateTimeFormatter
                        .ISO_OFFSET_DATE_TIME));
      
      //iso8601
      System.out.println(now.format(DateTimeFormatter
                        .ISO_OFFSET_DATE_TIME)
                        .replaceFirst("\\.\\d+", ""));
   }

}
