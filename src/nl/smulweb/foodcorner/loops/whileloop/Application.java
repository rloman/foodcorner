package nl.smulweb.foodcorner.loops.whileloop;


public class Application {
   
   public static void main(String[] args) {
      
      int a = 15;
      while(a < 35) {
         System.out.println(a);
         a++;
      }
      
      a = 15;
      
      do {
         System.out.println(a);
         a++;
      }
      while(a < 25);
   }

}
