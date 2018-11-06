package nl.smulweb.foodcorner.strings.builder;


public class Application {

   public static void main(String[] args) {
      
      String s = new String("aap");
      
      StringBuilder stringBuilder = new StringBuilder(s);
      
      for(int i = 0;i<5000;i++) {
         stringBuilder.append(i);
      }
      
      String result = stringBuilder.toString();
      
      System.out.println(result);
      
      System.out.println();
      
      stringBuilder.setLength(0);
      
      System.out.println(">"+stringBuilder+"<");
      
      stringBuilder = new StringBuilder();
      
      stringBuilder.append("Kippenhok");
      stringBuilder.reverse();
      
      System.out.println(stringBuilder.toString());

   }

}
