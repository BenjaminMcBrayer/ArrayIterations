public class SumOfExcess {
   public static void main (String [] args) {
      final int NUM_VALS = 4;
      int[] testGrades = new int[NUM_VALS];
      int i;
      int sumExtra = -9999; // Assign sumExtra with 0 before your for loop

      testGrades[0] = 0;
      testGrades[1] = 101;
      testGrades[2] = 110;
      testGrades[3] = 103;
      
      sumExtra = 0;
      for (i = 0; i < testGrades.length; ++i) {
         if (testGrades[i] > 100) {
              sumExtra = sumExtra + (testGrades[i] - 100);
         }
      }

      System.out.println("sumExtra: " + sumExtra);
   }
}