package nl.smulweb.foodcorner.variables;

class Person {
   int aantalKiezen;
   boolean male;
   
   char initial;
   
   void doo() {
      
      int b = 45;
      
      {
         int a =15;
      }
      
      {
         int a = 45;
         System.out.println(b);
      }
      
   }
}

public class Application {
   
   private String name;

   public static void main(String[] args) {
      
      int age = 51; //local variable
      
      System.out.println(age);
      
      Person p = new Person();
      
      System.out.println(p.aantalKiezen);
      
      String firstName = "Laurens";
      
      System.out.println(firstName);
      
      System.out.println(p.male);
      
      System.out.println(">"+p.initial+"<");
      System.out.println("<");
      
      
      
   }
   
   public void foo() {
      System.out.println(name);
   }
}
