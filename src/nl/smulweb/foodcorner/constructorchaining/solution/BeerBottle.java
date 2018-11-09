package nl.smulweb.foodcorner.constructorchaining.solution;


public class BeerBottle {
   
   private int size;
   
   public BeerBottle() {
      this(33);
   }
   
   public BeerBottle(int size) {
      this.size = size;
   }

   
   public int getSize() {
      return size;
   }

}
