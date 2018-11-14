package nl.smulweb.foodcorner.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {

   public static void main(String[] args) {

      System.out.println("Even");
      List<Integer> numberList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

      System.out.println("Oneven");
      numberList.stream().filter(n -> n % 2 == 1).forEach(n -> {
         System.out.println(n);
      });

      System.out.println("Groter dan 15");
      numberList.stream().filter(n -> n > 15).forEach(n -> {
         System.out.println(n);
      });

      Predicate<Integer> iPredicate = n -> n > 30;

      Predicate<Integer> langerePredicate = n -> {
         int m = n * n;

         return m > 25;
      };
      
      BiFunction<Integer, Integer, Integer> eenFunctieMetTweeInEnEenUit = (n, m)-> n*m;
      
      Consumer<Integer> etertje = n -> {
         System.out.println(n);
      };
      
      System.out.println("Kwadraten");
      numberList.stream().filter(n -> n %2 == 0).map(j -> j * j).forEach(e -> {
         System.out.println(e);
      });
      
      

   }

}
