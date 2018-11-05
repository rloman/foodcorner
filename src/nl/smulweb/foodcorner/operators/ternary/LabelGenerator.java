package nl.smulweb.foodcorner.operators.ternary;

public class LabelGenerator {

   // using ternary expression
   public String getLabelForAge(int age) {
      /*
       * if(age >= 65) { return "Senior"; } else { return "Jongere"; }
       */
      String label = age >= 65 ? "Senior" : "Jongere"; // ? is if, : is else

      // label = (age>= 65) ? "Senior" : age > 50 ? "Redelijk oud" : age > 33

      return label;
   }

   public String getGrade(int score) {

      String result = null;
      
      // switch (int, char, String, enum)
      switch (score) {
         case 90:
            result = "A";
            break;
         case 60:
            result = "B";

            break;

         case 50:
            result = "C";
            break;
            
         default:
            result = "X";
            break;
      }

      return result;
   }

}
