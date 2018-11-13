package nl.smulweb.foodcorner.interfaces;


// this is (comparable to) a 100% abstract class
public interface Television {
   
   /*public abstract*/ void on();
   public abstract void off();
   int increaseVolume();
   void switchChannel(int newChannel);

}
