package nl.smulweb.foodcorner.conditional;

public class Application {

   public static void main(String[] args) {
      int a = 2;
      
      if(a > 2) {
         //als true dan ...
         System.out.println("a is groter dan 2");
      }
      else {
         System.out.println("a is kleiner of gelijk aan 2");
         if( a > 1) {
            System.out.println("a is groter dan 1");
         }
      }

   }

}
