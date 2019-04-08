package nl.smulweb.foodcorner.lambdas.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

   public static void main(String[] args) {
      
      ArrayList<String> names = new ArrayList<>();
      names.addAll(Arrays.asList("Ronald", "Wout", "Arnold", "Raphael"));
      
      names.stream().filter(name -> name.contains("a")).forEach(name -> {
         System.out.println(name);
      });
   }
}
