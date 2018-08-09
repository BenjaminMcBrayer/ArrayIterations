public class ModifyArray {

	public static void swapArrayEnds(int[] sortArray, int numElem) {
		int i = 0;
		int tmpStore = 0;
		for (i = 0; i < (numElem / numElem); ++i) {
			tmpStore = sortArray[i];
			sortArray[i] = sortArray[numElem - 1 - i];
			sortArray[numElem - 1 - i] = tmpStore;
		}
	}

	public static void main(String[] args) {
		int numElem = 4;
		int[] sortArray = new int[numElem];
		int i = 0;

		sortArray[0] = 10;
		sortArray[1] = 20;
		sortArray[2] = 30;
		sortArray[3] = 40;

		swapArrayEnds(sortArray, numElem);

		for (i = 0; i < numElem; ++i) {
			System.out.print(sortArray[i]);
			System.out.print(" ");
		}
		System.out.println("");

		return;
	}
}