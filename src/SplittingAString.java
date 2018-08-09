import java.util.Scanner;

public class SplittingAString {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter a sentence: ");
		String userSentence = scnr.nextLine();
		String[] words = userSentence.split(" ");

		for (String word : words) {
			System.out.println(word);
			{
				scnr.close();
			}

		}
	}
}