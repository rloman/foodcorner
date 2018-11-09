package nl.smulweb.foodcorner.arraylist;

import java.util.ArrayList;

import nl.smulweb.foodcorner.model.Pan;
import nl.smulweb.foodcorner.model.Stove;

public class ApplicationWithGenerics {

   public static void main(String[] args) {
      
      ArrayList<Pan> pannenList = new ArrayList<>();  // diamond operator
      
//      pannenList.add("Piet");
     
      pannenList.add(new Pan());
      
//      pannenList.add(new Stove(220));
      

   }

}
