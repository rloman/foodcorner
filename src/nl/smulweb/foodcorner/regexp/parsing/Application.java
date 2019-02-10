package nl.smulweb.foodcorner.regexp.parsing;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

   public static void main(String[] args) {

      // example one
      {
         Pattern p = Pattern.compile("([A-Z]+[1-9]{1,2}\\s?)+?");
         Matcher matcher = p.matcher("A13 B14 ");

         if (matcher.matches()) {
            System.out.println("yes");
            String allMatch = matcher.group(0);
            System.out.println(allMatch);

            System.out.println("How many groups:" + matcher.groupCount()); // 0 is one big group

            System.out.println("all group: " + matcher.group(0));

            System.out.println(matcher.group(1));
         }
      }

      // example two
      {
         Pattern p = Pattern.compile("([A-Z]+[1-9]{1,2}\\s?)+?");
         Matcher matcher = p.matcher("A13 B14");

         while (matcher.find()) {
            System.out.println("I found the text " + matcher.group() + " starting at index " +
                              matcher.start() + " and ending at index " + matcher.end());
         }

      }

      // example 3
      {
         Pattern p = Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{2,3}");
         Matcher matcher = p.matcher("raymond@carpago.nl");
         if (matcher.matches()) {
            MatchResult matchResult = matcher.toMatchResult();
            int groupCount = matchResult.groupCount();
            for (int i = 0; i <= groupCount; i++) {
               System.out.println("MatchResult:>" + matchResult.group(i) + "<");
            }
         }

      }

   }

}
