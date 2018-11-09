package nl.smulweb.foodcorner.arraylist;

import java.util.ArrayList;

import nl.smulweb.foodcorner.model.Pan;
import nl.smulweb.foodcorner.model.Stove;

public class Application {

   public static void main(String[] args) {
      
      ArrayList lijst = new ArrayList();
      
      lijst.add("Piet");
      lijst.add(new Pan());
      lijst.add(new Stove(220));
      
      System.out.println("Expected 3: "+lijst.size());
      
      for(Object element : lijst) {
         System.out.println(element);
      }
      
      System.out.println(lijst.get(1));
      
      lijst.remove(1);
     
      System.out.println("Expected 2: "+lijst.size());
      
      System.out.println(lijst.get(1));
      
      
      lijst.set(1,  5);
      
      System.out.println(lijst);
      
      
   }

}
