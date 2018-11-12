package nl.smulweb.foodcorner.statics.demo;


public class Car {
   
   private String licensePlate;
   
   private static int carCounter;
   
   public static int getCarcounter() {
      return carCounter;
   }

   
   public Car(String licensePlate) {
      this.licensePlate = licensePlate;

      Car.carCounter++;
   }
   
   public String getLicensePlate() {
      return licensePlate;
   }


   @Override
   public String toString() {
      return "Car ["+Labels.LICENSEPLATE + "=" + licensePlate + "]";
   }

}
