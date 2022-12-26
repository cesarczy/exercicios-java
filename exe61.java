package testeLogico;

public class Exercise4 {

	public static void main(String[] args) {

		int[] array = { 9, 2, 3, 1, 4 };

		// Finding the largest number within the suggested array
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		// Creating a new array to store the missing numbers within the range
		int[] missingNumbers = new int[max - array.length + 1];

		// Finding the missing numbers and adding to the new array already created
		int missingIndex = 0;
		for (int i = 1; i <= max; i++) {
			boolean found = false;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				missingNumbers[missingIndex] = i;
				missingIndex++;
			}
		}

		//Concatenating arrays
		int[] result = new int[array.length + missingNumbers.length];
		System.arraycopy(array, 0, result, 0, array.length);
		System.arraycopy(missingNumbers, 0, result, array.length, missingNumbers.length);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}