package nl.smulweb.foodcorner;

import nl.smulweb.foodcorner.model.*;
import nl.smulweb.foodcorner.model.recepten.Recept;

public class Application {

   public static void main(String[] args) {

      Stove stove = new Stove(220);

      System.out.println(stove.getMaxTemperature());
      System.out.println(stove.getTemperature());

      stove.raiseTemperature();
      System.out.println(stove.getTemperature());

      stove.raiseTemperature();
      System.out.println(stove.getTemperature());

   }

}
