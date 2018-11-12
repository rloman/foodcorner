package nl.smulweb.foodcorner.access.prive;


public class DemoPrivateAccess {
   
   public static void main(String[] args) {
      
      Car a = new Car("A");
      Car b = new Car("B");
      
      a.foo(b);
   }
}
