package nl.smulweb.foodcorner.exceptions;

public class Application {

   public static void main(String[] args) {

      // alsof dit via een invoer/webscherm binnen komt???
      int a = 4;
      int b = 0;
      
      try {
         System.out.println(divide(a, b));
      }
      catch (ArithmeticException npe) {
         System.out.println("Ae");
      }
      catch(ImpossibleToDivideByZeroException ie) {
         System.out.println(ie.getMessage());
      }
      catch (Exception anException) { // catch all ... pas op: niet altijd best practise
         System.out.println("Dat ging fout want ik weet nu niet meer precies waarom! :-)");

         return;
      }

      finally {
         System.out.println("In het finally block");
         // normaliter wordt hier dan een bestand afgesloten of iets dergelijks ...
      }
      // hier jumped hij naar toe als het goed gaat
      // (en hij komt hier nu ook na het uitvoeren van het catch block)

      System.out.println("Successvol Einde programmma!!!");
   }

   public static int divide(int a, int b)
                     throws InterruptedException, ImpossibleToDivideByZeroException {

      Thread.sleep(1000);

      if (b == 0) {
         throw new ImpossibleToDivideByZeroException("Stom he!!!");
      }

      int result = a / b;

      return result;
   }

}
