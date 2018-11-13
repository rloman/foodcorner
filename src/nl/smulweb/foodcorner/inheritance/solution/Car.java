package nl.smulweb.foodcorner.inheritance.solution;


public class Car extends Vehicle {
   
   private String licensePlate;
   private int mileAge;
   
   public Car(String licensePlate) {
      this.licensePlate = licensePlate;
   }
   
   @Override
   public void drive() {
      
      System.out.println("Driving car ... ");
      this.mileAge++;
   }

   public String getLicensePlate() {
      return licensePlate;
   }
   
   public int getMileAge() {
      return mileAge;
   }

}
