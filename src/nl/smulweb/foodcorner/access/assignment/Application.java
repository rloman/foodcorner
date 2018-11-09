package nl.smulweb.foodcorner.access.assignment;

import nl.smulweb.foodcorner.access.assignment.model.AlcoholicDrink;
import nl.smulweb.foodcorner.access.assignment.model.AlcoholFreeDrink;

public class Application {

   public static void main(String[] args) {
      
      AlcoholicDrink d = new   AlcoholicDrink();
      AlcoholFreeDrink d2 = new AlcoholFreeDrink();
      
      d.drinkMe(); // should be unable to invoke
//      d2.drinkMe(); // should be able to invoke
      
   }

}
