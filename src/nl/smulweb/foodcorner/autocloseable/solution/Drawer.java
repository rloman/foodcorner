package nl.smulweb.foodcorner.autocloseable.solution;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Drawer implements AutoCloseable {
   
   private boolean open;
   
   private Set<String> names = new HashSet<String>();
   
   public Drawer() {
      this.open = true;
   }
   
   public void add(String name) {
      this.names.add(name);
   }

   @Override
   public void close() throws IOException {
      
      this.open = false;
      System.out.println("The drawer is automatically closed");
      
   }

}
