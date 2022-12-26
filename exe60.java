package testeLogico;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Integer[] array = { 1, 15, 2, 7, 2, 5, 7, 1, 4 };
		int num1, num2, sum = 0;

		Scanner e = new Scanner(System.in);

		System.out.println("Type the 1º number: ");
		num1 = e.nextInt();

		Scanner e1 = new Scanner(System.in);

		System.out.println("Type the 2º number: ");
		num2 = e1.nextInt();

		sum = num1 + num2;

		boolean val = contains(array, sum);

		System.out.println("The sum of the two numbers is equal: " + sum);

		System.out.println("Array contains " + sum + "? \n" + val);

	}

	private static boolean contains(Integer[] array, int sum) {
		return Arrays.asList(array).contains(sum);
	}

}
