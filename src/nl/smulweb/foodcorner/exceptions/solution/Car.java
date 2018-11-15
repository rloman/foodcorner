package nl.smulweb.foodcorner.exceptions.solution;


public class Car {
   
   private String licensePlate;
   private int mileAge;
   
   private PetrolTank tank;
   
   public Car(String licensePlate, int maxLevelOfTank) {
      this.licensePlate = licensePlate;
      this.tank = new PetrolTank(maxLevelOfTank);
   }

   
   public String getLicensePlate() {
      return licensePlate;
   }

   
   public int getMileAge() {
      return mileAge;
   }
   
   public void drive() {
      this.drive(1);
   }
   
   public void drive(int mileage){
      this.mileAge += mileage;
   }
   
   public void fill(int liters) throws PetrolTankOverflowException {
      this.tank.fill(liters);
   }

}
