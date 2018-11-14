package nl.smulweb.foodcorner.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Application {

   public static void main(String[] args) {
      
      List<Integer> numberList = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89);
      Predicate <Integer> onsPredicate = new MyEvenNumberTestingPredicate();
      numberList.stream().filter(onsPredicate).forEach(n -> {
         System.out.println(n);
      });

   }

}
