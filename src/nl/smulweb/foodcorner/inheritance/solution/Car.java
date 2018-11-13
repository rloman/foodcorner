package nl.smulweb.foodcorner.inheritance.solution;


public class Car extends Vehicle {
   
   private String licensePlate;
   private int mileAge;
   
   public Car() {
      
   }
   
   public Car(String licensePlate) {
      this.licensePlate = licensePlate;
   }
   
   public void drive() {
      this.mileAge++;
   }

   public String getLicensePlate() {
      return licensePlate;
   }
   
   public int getMileAge() {
      return mileAge;
   }

}
