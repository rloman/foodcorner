package nl.smulweb.foodcorner.garbagecollection;


public class Application {

   public static void main(String[] args) throws InterruptedException {
      
      foo();
      
      System.gc();
      
      Thread.sleep(10000);

   }
   
   public static void foo() {
      // ukkel!!!
      for(int i = 0;i<1000;i++) {
         Fruit f = new Fruit();
      }
      
   } // f is eligible for GC
   
   

}
