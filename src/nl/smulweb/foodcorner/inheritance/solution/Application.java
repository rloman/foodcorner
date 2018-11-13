package nl.smulweb.foodcorner.inheritance.solution;

import java.util.ArrayList;

public class Application {
   
   public static void main(String[] args) {
      Truck truckje = new Truck("AA-BB-CC");
      
//      truckje.drive();
      
      // best practice! declare left to upper in tree, create with lower in tree
      
      Vehicle v = new Truck("AA");
      
      v.drive();
      
      ArrayList<Vehicle> lijst = new ArrayList<>();
      lijst.add(new Truck("A"));
      lijst.add(new Car("B"));
      
      VehicleDoctor.repair(lijst);
      
      System.out.println(truckje.getMaxWeight());
      
      long l = 3;
      
      Vehicle o = new Truck("A");
      
      o.drive();
      
      
      
      
      
   }

}
