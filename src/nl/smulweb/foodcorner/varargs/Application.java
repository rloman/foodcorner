package nl.smulweb.foodcorner.varargs;


public class Application {

   public static void main(String[] args) {
      
      int[] numbers = {1,23,34,2,88,99};
      
      NumberTool numberTool = new NumberTool();
      
      int maxUitNumbers = numberTool.max(numbers);
      
      System.out.println("Should be: 99 and is: "+maxUitNumbers);
      
      int a = 42;
      int b = 43;
      int c = 12;
      
      int anderMax = numberTool.maxUsingVarargsPrinciple(a,b,c);
      
      System.out.println("Should be: 43 and is: "+anderMax);

   }

}
