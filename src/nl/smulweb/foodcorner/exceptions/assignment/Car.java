package nl.smulweb.foodcorner.exceptions.assignment;


public class Car {
   
   private String licensePlate;
   private int mileAge;
   
   private PetrolTank tank;
   
   public Car(String licensePlate, int maxLevelOfTank) {
      this.licensePlate = licensePlate;
      this.tank = new PetrolTank(maxLevelOfTank); // see constructor of PetrolTank
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
   
   public void fill(int liters) { // ??? Have to add some here???
      this.tank.fill(liters);
   }

}
