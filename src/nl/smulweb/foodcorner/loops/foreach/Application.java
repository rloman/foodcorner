package nl.smulweb.foodcorner.loops.foreach;


public class Application {
   
   public static void main(String[] args) {
      String[] names = new String[]{"Tjitte", "Jaap", "Esmee"};
      
      String[] otherNames = new String[3];
      
      // for each / enhanced for
      for(String name : names) {
         System.out.println(name);
      }
      
   }

}
