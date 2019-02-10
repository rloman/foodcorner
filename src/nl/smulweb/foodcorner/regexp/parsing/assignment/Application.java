package nl.smulweb.foodcorner.regexp.parsing.assignment;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

   public static void main(String[] args) {

      System.out.println("Example 1");
      {
         String label = "I was born on 09-08-1968 and that was a Friday!!!";
         Pattern p = Pattern.compile("// ??? ///");
         Matcher matcher = p.matcher(label);

         while (matcher.find()) {
            System.out.println(">" + matcher.group() + "<");
         }
      }
      
      System.out.println("Example 2");
      {
         String label = "I was born on 09-08-1968 and that was a Friday!!!";
         Pattern p = Pattern.compile("/// ??? ///");
         Matcher matcher = p.matcher(label);

         if (matcher.matches()) {
            String all = null; //??? matcher.(???)
            String day = null; // idem
            String month = null;
            String year = null;
            
            LocalDate birthDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
            
            System.out.println(birthDate.getDayOfWeek());
         }
         else {
            System.out.println("No match");
         }

      }
   }
}
