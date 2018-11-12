package nl.smulweb.foodcorner.overloading;


public class Car {
   
   private int mileage;
   
   public Car() {
      this(-1);
   }
   
   public Car(int mileage) {
      this.mileage = mileage;
   }
   
   public void drive() {
      this.drive(1);
   }
   
   // overloaded method
   public int drive(int mileage) {
      this.mileage += mileage;
      
      return mileage;
   }

   
   public int getMileage() {
      return mileage;
   }

}
