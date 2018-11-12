package nl.smulweb.foodcorner.access.prive.bigcars;

import nl.smulweb.foodcorner.access.prive.Car;

public class Truck {
   
   public void bar(Car andereCar) {
      System.out.println(andereCar.licensePlate); // compile error!!!
   }

}
