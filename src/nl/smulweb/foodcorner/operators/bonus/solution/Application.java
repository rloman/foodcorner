package nl.smulweb.foodcorner.operators.bonus.solution;


public class Application {
   
   public static void main(String[] args) {
      int input = 350;
      
      int hours = input / 60;
      int minutes = input % 60;
      
      System.out.println("Hours: "+hours+", minutes: "+minutes);
   }

}
