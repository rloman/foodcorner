package nl.smulweb.foodcorner.scanner;

import java.util.Scanner;

public class Application {

   public static void main(String[] args) {

      try (Scanner scanner = new Scanner(System.in)) {

         
         while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if("".equals(line)){
               break;
            }
            System.out.println(line);
         }
      }

   }

}
