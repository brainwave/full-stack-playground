import java.util.Scanner;

public class BinarySearch {

	private int[] genArray(int arraySize) {
		int[] array = new int[arraySize];

		for (; arraySize > 0; --arraySize) {
			array[arraySize - 1] = arraySize;
		}

		return array;
	}

	private int searchArray(int[] array, int searchValue, int low, int high) {
		if (low > high) {
			return -1;
		} else {
			int mid = (low + high) / 2;

			if (searchValue == array[mid])
				return mid;

			else if (searchValue > array[mid]) // x is on the right side
				return searchArray(array, searchValue, mid + 1, high);

			else // x is on the right side
				return searchArray(array, searchValue, low, mid - 1);
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();

		final long startTime = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter array size : ");
		int arraySize = sc.nextInt();
		System.out.printf("Enter search term: ");

		System.out.println("Index of element: " + bs.searchArray(bs.genArray(arraySize), sc.nextInt(), 0, arraySize));

		sc.close();

		final long endTime = System.currentTimeMillis();

		System.out.println("program execution time: " + (endTime - startTime));
	}
}