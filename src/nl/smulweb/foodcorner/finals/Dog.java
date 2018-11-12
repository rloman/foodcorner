package nl.smulweb.foodcorner.finals;


public class Dog {
   
   private final String name;
   
   public Dog(String name) {
      this.name = name;
   }
   
   public Dog(){
      this("unknown");
   }
   
   
   public final String getName() {
      return name;
   }
}

class GermanSheperd extends Dog {
 
   // compile error
//   public String getName() {}
   
}

