package nl.smulweb.foodcorner.access.solution;

import nl.smulweb.foodcorner.access.solution.model.AlcoholicDrink;
import nl.smulweb.foodcorner.access.solution.model.AlcolholFreeDrink;

public class Application {

   public static void main(String[] args) {
      
      AlcoholicDrink d = new   AlcoholicDrink();
      AlcolholFreeDrink d2 = new AlcolholFreeDrink();
      
      d.drinkMe();
      d2.drinkMe();
      
   }

}
