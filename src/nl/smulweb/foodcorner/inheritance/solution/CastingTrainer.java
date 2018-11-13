package nl.smulweb.foodcorner.inheritance.solution;


public class CastingTrainer {
   
   public static void main(String[] args) {
      
      Vehicle v = new Truck("A");
      foo(v);
      
      bar(3_000_000_000L);
      
   }
   
   
   public static void bar(long longIn) {
      
      // maflander!!!
      int intAfgekapt = (int) longIn;
      
      System.out.println(intAfgekapt);
      
   }
   
   public static void foo(Vehicle vInput) {
      if(vInput instanceof Truck) {
         Car t = (Racecar) vInput;  // <=
//         System.out.println(t.getMaxWeight());
      }
   }

}
