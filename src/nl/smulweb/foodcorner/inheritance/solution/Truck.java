package nl.smulweb.foodcorner.inheritance.solution;

public class Truck extends Car {

   private double maxWeight;
   
   public Truck(String licensePlate) {
      super(licensePlate);
   }
   
   @Override
   public void drive() {
      super.drive();
      System.out.println("Driving Truck ... ");
   }
   
   public double getMaxWeight() {
      return maxWeight;
   }

   public void setMaxWeight(double maxWeight) {
      this.maxWeight = maxWeight;
   }

}
