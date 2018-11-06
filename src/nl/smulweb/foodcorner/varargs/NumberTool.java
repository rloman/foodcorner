package nl.smulweb.foodcorner.varargs;

public class NumberTool {

   public int max(int[] numbers) {
      int max = numbers[0];

      for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] > max) {
            max = numbers[i];
         }
      }

      return max;
   }

   public int maxUsingVarargsPrinciple(int first, int... numbers) {

      int max = first;
      for (int n : numbers) {
         if (n > max) {
            max = n;
         }
      }

      return max;

   }

}
