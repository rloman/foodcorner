package nl.smulweb.foodcorner.regexp.parsing.solution;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

   public static void main(String[] args) {

      System.out.println("Example 1");
      {
         String label = "I was born on 09-08-1968 and that was a Friday!!!";
         Pattern p = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
         Matcher matcher = p.matcher(label);

         while (matcher.find()) {
            System.out.println(">" + matcher.group() + "<");
         }
      }

      System.out.println("Example 2");
      {
         String label = "I was born on 09-08-1968 and that was a Friday!!!";
         Pattern p = Pattern.compile(".*([0-9]{2})-([0-9]{2})-([0-9]{4}).*");
         Matcher matcher = p.matcher(label);

         if (matcher.matches()) {
            String all = matcher.group(0);
            String day = matcher.group(1);
            String month = matcher.group(2);
            String year = matcher.group(3);

            LocalDate birthDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

            System.out.println(birthDate.getDayOfWeek());
         }
         else {
            System.out.println("No match");
         }

      }
   }
}
