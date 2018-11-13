package nl.smulweb.foodcorner.interfaces;


// this is (comparable to) a 100% abstract class
public interface Television {
   
   /* public static final */
   double BTW = 21.0;
   
   /*public abstract*/ void on();
   public abstract void off();
   int increaseVolume();
   void switchChannel(int newChannel);
   
   /* public */ 
   default void cleanScreen() {
      System.out.println("Cleaning screen with water ...");
   }

}
