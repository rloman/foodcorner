package nl.smulweb.foodcorner.lambdas;

import java.util.function.Predicate;

public class MyEvenNumberTestingPredicate implements Predicate<Integer> {

   @Override
   public boolean test(Integer n) {
      boolean result = n % 2 == 0;
      
      return result;
   }
}