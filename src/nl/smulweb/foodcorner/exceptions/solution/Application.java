package nl.smulweb.foodcorner.exceptions.solution;

public class Application {

   public static void main(String[] args) {
      Car c = new Car("AABBCC", 45);

      try {
         c.fill(100);
      }
      catch (PetrolTankOverflowException e) {
         System.out.println("Please stop it ... you are overfilled!!!");
      }
   }

}
