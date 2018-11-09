package nl.smulweb.foodcorner.constructorchaining.solution;


public class Application {
   
   public static void main(String[] args) {
      

      
      BeerBottle beerBottleThirsty = new BeerBottle(45);
      
      System.out.println("Expected: 45, actual: "+beerBottleThirsty.getSize());
   
      
      BeerBottle beerBottle = new BeerBottle();
      
      System.out.println("Expected: 33, actual: "+beerBottle.getSize());
   }

}
