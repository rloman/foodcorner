package nl.smulweb.foodcorner.inheritance;


public class Application {
   
   public static void main(String[] args) {
      
      Animal animal = new Animal();
      animal.setName("Wodan");

      System.out.println(animal);
      
      Dog hond = new Dog();
      hond.setName("Willy");
      
      System.out.println(hond.getName());
      hond.bark();
      
      Cat c = new Cat();
      
      c.setName("Mickey");
      
      System.out.println(c.getName());
      
      c.eat();
      
      System.out.println(c.getWeight());
      
      System.out.println(c);
      
   }

}
