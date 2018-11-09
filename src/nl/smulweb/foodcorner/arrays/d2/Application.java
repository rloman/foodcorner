package nl.smulweb.foodcorner.arrays.d2;

public class Application {

   public static void main(String[] args) {

      int[][] numbers = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

      System.out.println(numbers[0]);

      for (int element : numbers[0]) {
         System.out.println(element);
      }

      System.out.println("Should be 3 and is: " + numbers[0][2]);

      System.out.println(numbers[2][1]);

      int[][] table = new int[10][10];

      for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {

            table[i][j] = (i + 1) * (j + 1);

         }

      }

      for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {

//            System.out.println((i + 1) + "x" + (j + 1) + "=" + table[i][j]);

            System.out.printf("%1dx%1d=%3d%n", i+1, j+1, table[i][j]);
         }

      }

   }

}
