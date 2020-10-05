package nl.smulweb.foodcorner.autocloseable.assignment;

import java.util.HashSet;
import java.util.Set;

public class Drawer /* implements ??? */{
   
   private boolean open;
   
   private Set<String> names = new HashSet<String>();
   
   public Drawer() {
      this.open = true;
   }
   
   public void add(String name) {
      this.names.add(name);
   }

//   ??? add a method

}
