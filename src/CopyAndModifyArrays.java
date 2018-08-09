
public class CopyAndModifyArrays {
	public static void main (String [] args) {
	      final int SCORES_SIZE = 4;
	      int[] oldScores = new int[SCORES_SIZE];
	      int[] newScores = new int[SCORES_SIZE];
	      int i;

	      oldScores[0] = 10;
	      oldScores[1] = 20;
	      oldScores[2] = 30;
	      oldScores[3] = 40;
	      
	      //Copy oldScores to newScores.
	      for (i = 0; i < SCORES_SIZE; ++i) {
	         newScores[i] = oldScores[i];
	         System.out.print(newScores[i] + " ");
	      }
	         System.out.println();

	      // Shift elements left by one place.
	      for (i = 0; i < newScores.length - 1; ++i) {
	            newScores[i] = newScores[i + 1];
	            System.out.print(newScores[i] + " ");
	      }
	      if (newScores.length == 4) {	
	      newScores[3] = oldScores [0];
	      } System.out.println();
	      	
	      //Print newScores.
	      for (i = 0; i < newScores.length; ++i) {
	         System.out.print(newScores[i] + " ");
	      }
	      System.out.println();
	   }}