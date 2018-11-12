package nl.smulweb.foodcorner.inheritance;


public class Dog extends Animal {
   
   
   public String bark() {
      System.out.println("Woof ... ");
      return "Woof ...";
   }
   
   protected void privateDogMethod() {
      System.out.println("This is a private Dog method");
   }
   
   
   

}
