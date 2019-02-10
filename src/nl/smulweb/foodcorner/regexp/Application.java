package nl.smulweb.foodcorner.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

   public static void main(String[] args) {

      // 1st way
      Pattern p = Pattern.compile("[1-9]{1}[0-9]{3}\\s?[A-Z]{2}"); // that crappy \\ :-(
      // p is here a kind of regexp
      Matcher matcher = p.matcher("1013AB");

      boolean matches = matcher.matches();
      if (matches) {
         System.out.println("Matches");
      }

      // 2nd way
      boolean b2 = Pattern.compile(".s").matcher("as").matches();

      // 3rd way
      boolean b3 = Pattern.matches(".s", "as");
   }

}
