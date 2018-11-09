package nl.smulweb.foodcorner.wrapper;


public class Application {

   public static void main(String[] args) {
      
      NumberTooler tooler = new NumberTooler();
      tooler.foo(3);
      
      String yourBsn = "127797582";
      
      int bsnPrimitive = Integer.parseInt(yourBsn);
      
      
      System.out.println(++bsnPrimitive);
      
      System.out.println(Integer.MAX_VALUE);
      
      System.out.println(Integer.MIN_VALUE);
      
      System.out.println(Long.MAX_VALUE);
      
      long max = Long.max(3, 45);
      
      System.out.println(max);
      
      System.out.println(Long.reverse(45));
      
      boolean trueOrFalse = Boolean.valueOf("1");
      System.out.println(trueOrFalse);
      
      
      
      
      
      
   }

}
