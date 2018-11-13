package nl.smulweb.foodcorner.inheritance.solution;

public class Truck extends Car {

   private double maxWeight;
   
   public Truck(String licensePlate) {
      super(licensePlate);
   }

   public double getMaxWeight() {
      return maxWeight;
   }

   public void setMaxWeight(double maxWeight) {
      this.maxWeight = maxWeight;
   }

}
