package nl.smulweb.foodcorner.tilde;


public class Application {

   public static void main(String[] args) {
      
      byte value = 1; // 00000001
      
      int complement = ~value; //11111110
      
      System.out.println(complement);

   }

}
