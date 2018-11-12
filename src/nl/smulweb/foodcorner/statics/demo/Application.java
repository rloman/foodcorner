package nl.smulweb.foodcorner.statics.demo;


public class Application {
   
   public static void main(String[] args) {
      Car a = new Car("A");
      Car b = new Car("B");
      
      System.out.println(Car.getCarcounter());
      
      System.out.println(a);
      
      System.out.println(Car.getCarcounter());
      
      System.out.println(b);
      
      
   }

}
