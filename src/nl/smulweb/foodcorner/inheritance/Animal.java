package nl.smulweb.foodcorner.inheritance;

public class Animal {

   private String name;

   private double weight;

   public void eat() {

      weight += 0.1;

   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getWeight() {
      return weight;
   }

   @Override
   public String toString() {
      return "Animal [name=" + name + ", weight=" + weight + "]";
   }
   
   
}
