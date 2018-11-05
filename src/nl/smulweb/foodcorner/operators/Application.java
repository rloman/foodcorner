package nl.smulweb.foodcorner.operators;

public class Application {

   public static void main(String[] args) {
      int age = 50;
      
      //add
      age = age + 1;

      // multiply
      age = age * 3;

      //division
      age = age / 3;

      //subtract
      age = age - 3;
      
      
      System.out.println(age);
      
      age = 23;
      
      // postfix increment
      age++; // gelijk aan: age = age + 1;
      
      // prefix increment
      ++age;  // gelijk aan age = age + 1;
      
      System.out.println(age); // <= 25
      
      System.out.println(age++); // <= 25
//      age++; //is wellicht duidelijker
      
      System.out.println(++age); // <= 27
      
      
      int c = 3;
      int d = -c;
      
      boolean male = true;
      
      boolean female = !male;
      
      int d1 = 16;
      int d2 = d1 >>> 3;
      
      System.out.println(d2);
      
      if( d1 > 15) {
         System.out.println("d1 is groter dan 15");
      }
      else {
         System.out.println("d1 is kleiner of gelijk aan 15");
      }
      
      int e = 15;
      
      e += 13;
      // zelfde als e = e + 13;
   }

}
