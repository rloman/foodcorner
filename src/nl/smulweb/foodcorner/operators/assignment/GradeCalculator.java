package nl.smulweb.foodcorner.operators.assignment;

public class GradeCalculator {

   public String getGrade(int scorePercentage) {
      if (scorePercentage >= 90) {
         return "A";
      }
      else {
         // fill in the blanks
         return "X";
      }
   }
}