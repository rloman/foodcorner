package nl.smulweb.foodcorner.listtoarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

   public static void main(String[] args) {

      // from ArrayList to array
      {
         ArrayList<String> namesList = new ArrayList<>();

         namesList.add("Piet");

         String[] namesAsArray = namesList.toArray(new String[0]);

         System.out.println(namesAsArray);

      }

      // now reverse (from array to List)
      {
         Integer[] numbers = new Integer[] { 0, 1, 1, 2, 3, 5, 8};
         
         List<Integer> numberList = Arrays.asList(numbers);
         
      }
      
      // handy
      List<Integer> numbers = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89);
      
      int sum = 0;
      for(int element : numbers) {
         sum += element;
      }
      
      System.out.println("Expected: 232 and is:"+sum);

   }

}
