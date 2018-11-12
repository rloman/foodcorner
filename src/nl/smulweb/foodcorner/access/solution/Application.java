package nl.smulweb.foodcorner.access.solution;

import nl.smulweb.foodcorner.access.solution.model.AlcoholicDrink;
import nl.smulweb.foodcorner.access.solution.model.AlcoholFreeDrink;

public class Application {

   public static void main(String[] args) {
      
      AlcoholicDrink d = new   AlcoholicDrink();
      AlcoholFreeDrink d2 = new AlcoholFreeDrink();
      
      d.drinkMe();
      d2.drinkMe();
      
   }

}
