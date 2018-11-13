package nl.smulweb.foodcorner.inheritance.solution;

import java.util.ArrayList;

public class VehicleDoctor {
   
   public static void repair(ArrayList<Vehicle> vehicles) {
      for(Vehicle v : vehicles){
         v.drive();
      }
   }

}
