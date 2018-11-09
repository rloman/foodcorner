package nl.smulweb.foodcorner.statics.solution;


public class Application {
   public static void main(String[] args) {
      Car first = new Car();
      Car second = new Car();
      Car third = new Car();
      
      System.out.println("Expected: 3, actual:"+Car.carCounter);
   }

}
