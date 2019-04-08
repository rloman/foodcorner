package nl.smulweb.foodcorner.lambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoMyEvenNumberPredicate {

   public static void main(String[] args) {
      
     ArrayList<Integer> numbers = new ArrayList<>();
     numbers.addAll(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55));
     
     numbers.stream().filter(new MyEvenNumberTestingPredicate()).forEach(number -> {
        System.out.println(number);
     });

   }
}