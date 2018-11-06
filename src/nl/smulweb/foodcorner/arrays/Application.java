package nl.smulweb.foodcorner.arrays;

import java.util.Arrays;

public class Application {

   public static void main(String[] args) {
      
      String[] names = {"Linda", "Klaas", "Piet"};
      
      for(String name : names) {
         System.out.print(name);
         System.out.print(" ");
      }
      
      System.out.println();
      
      Arrays.sort(names);
      
      for(String name : names) {
         System.out.print(name);
         System.out.print(" ");
      }
      
      System.out.println();

      int[] numbers = { 15, 12, 21, 33, 2, 8, 7 };

      Arrays.sort(numbers);

      for (int n : numbers) {
         System.out.print(n);
         System.out.print(" ");
      }

   }

}
