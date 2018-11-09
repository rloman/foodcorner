package nl.smulweb.foodcorner.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Application {

   public static void main(String[] args) {
      
      LocalDate now = LocalDate.now();  // now() is static (gebonden aan LocalDate)

      // now is nu een instantie van LocalDate
      
      System.out.println(now);
      
      
      System.out.println(LocalDateTime.now());
      
      LocalDate birthDayEsmee = LocalDate.of(1990, 9, 10);
      
      LocalDate dagLater = birthDayEsmee.plusDays(1);
      
      System.out.println(dagLater);
      
      System.out.println(birthDayEsmee.getDayOfWeek());
      
      System.out.println(birthDayEsmee.plusYears(1).plusDays(1));
      
      long years = ChronoUnit.YEARS.between(birthDayEsmee, LocalDate.now());
      
      System.out.println(years);
      
      Period period = Period.between(birthDayEsmee,  LocalDate.now());
      
      
      System.out.println(period);
      
      
      System.out.printf("Esmee loopt rond %d jaar, %d maand en %d dagen%n", 
                        period.getYears(), period.getMonths(), period.getDays());
      
      long aantalDagenEsmee = ChronoUnit.DAYS.between(birthDayEsmee,  LocalDate.now());
      
      
      System.out.println(aantalDagenEsmee);
      
      LocalDateTime esmeeDateTime = LocalDateTime.of(1990, 9, 11, 13, 7,0);
      
      System.out.println(esmeeDateTime);
      
      System.out.println(ChronoUnit.SECONDS.between(esmeeDateTime, LocalDateTime.now()));
      
   }

}
