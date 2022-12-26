package testeLogico;

public class Exercise1 {

	public static void main(String[] args) {

		int[] array = { 2, 1, 5, 2, 5, 2, 1, 1, 1, 7, 9, 13, 127, 21 };
		int[] newArray = new int[array.length];
		int count = 0;
		int j = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				count++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				newArray[j] = 1;
				j++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 1) {
				newArray[j] = array[i];
				j++;
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
