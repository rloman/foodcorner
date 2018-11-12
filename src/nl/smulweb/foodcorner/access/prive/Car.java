package nl.smulweb.foodcorner.access.prive;

public class Car {

   public String licensePlate;

   public Car(String licensePlate) {
      this.licensePlate = licensePlate;
   }
   
   public void foo(Car andereCar) {
      System.out.println(andereCar.licensePlate);
      
      Car c = new Car("C");
      System.out.println(c.licensePlate);
   }
}