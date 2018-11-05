package nl.smulweb.foodcorner.operators.assignment;


public class Application {

   public static void main(String[] args) {
      GradeCalculator gradeCalculator = new GradeCalculator();
      
      System.out.println("50 should be C and is:"+gradeCalculator.getGrade(50));
      System.out.println("35 should be F and is:"+gradeCalculator.getGrade(35));
      System.out.println("95 should be A and is:"+gradeCalculator.getGrade(95));
      
      
   }
}
