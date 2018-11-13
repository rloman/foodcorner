package nl.smulweb.foodcorner.garbagecollection;


public class Fruit {

   @Override
   protected void finalize() throws Throwable {
      super.finalize();
      System.out.println("Fruit is being garbage collected ...");
   }
   
   

}
