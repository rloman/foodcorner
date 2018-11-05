package nl.smulweb.foodcorner.operators.solution;

public class GradeCalculator {

   public String getGrade(int scorePercentage) {
      if (scorePercentage >= 90) {
         return "A";
      }
      else {
         if (scorePercentage >= 70 && scorePercentage <= 90) {
            return "B";
         }
         else {
            if (scorePercentage >= 50 && scorePercentage < 70) {
               return "C";
            }
            else {
               return "F";
            }
         }
      }
   }
}