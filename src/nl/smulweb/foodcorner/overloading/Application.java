package nl.smulweb.foodcorner.overloading;


public class Application {
   
   public static void main(String[] args) {
      Car car = new Car();
      
      car.drive();
      car.drive();
      car.drive();
      
      System.out.println(car.getMileage());
      
      int driven = car.drive(5);
      
      System.out.println(driven);
   }

}
