package nl.smulweb.foodcorner.loops.labels;

public class Application {

   public static void main(String[] args) {

      outer:
      for (int i = 1; i < 11; i++) {
         for (int j = 1; j <= i; j++) {
            if( j == 5 ){
               continue outer;
            }
            System.out.println(i+"x"+j+"="+i*j);
         }
      }

   }

}
