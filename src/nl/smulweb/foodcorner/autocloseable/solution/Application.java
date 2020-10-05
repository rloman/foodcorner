package nl.smulweb.foodcorner.autocloseable.solution;

import java.io.IOException;

public class Application {
   
   public static void main(String[] args) throws IOException {
      
      try(Drawer drawer = new Drawer()) {
         
         String name ="Piet";
         String otherName = "Jan";
         String oneMore = "Karel";
         
         drawer.add(name);
         drawer.add(otherName);
         drawer.add(oneMore);
         
      }
      
   }

}
