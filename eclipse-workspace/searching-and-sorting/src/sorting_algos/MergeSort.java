package sorting_algos;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import algorithms_and_ds.Array;

public class MergeSort extends Array {

	// some constants and static members.
	static public final int arraySize = 107374182; // java VM for some reason supports only 2^30 as maximum
	// array
	// size
	static public Logger logger = Logger.getLogger(MergeSort.class.getName()); // static logger for all objects of
																				// MergeSort class
	static public final int dir = -1;

	// Constructor
	MergeSort() {
		super(arraySize); // create array of maximum size
		logger.log(Level.INFO, "MergeSort object instantiated successfully");
	}

	private void mergeSort(int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			mergeSort(left, mid);
			mergeSort(mid + 1, right);
			merge(left, mid, right);
		}
		/*
		 * else logger.log(Level.INFO, Integer.toString(left));
		 */
	}

	private void merge(int left, int mid, int right) {
		int[] leftSubArray = Arrays.copyOfRange(this.array, left, mid + 1);
		int[] rightSubArray = Arrays.copyOfRange(this.array, mid + 1, right + 1);

		int i, j;
		i = j = 0;
		int k = left;

		while ((i <= (leftSubArray.length - 1)) && j <= (rightSubArray.length - 1)) {
			if (leftSubArray[i] <= rightSubArray[j]) {
				this.array[k] = leftSubArray[i++];
				k++;
			} else {
				this.array[k] = rightSubArray[j++];
				k++;
			}

		}

		while (i <= leftSubArray.length - 1)
			this.array[k++] = leftSubArray[i++];

		while (j <= rightSubArray.length - 1)
			this.array[k++] = rightSubArray[j++];
		// k++;
	}

	public static void main(String[] args) {
		// set level to info for detailed logs
		logger.setLevel(Level.INFO);

		MergeSort ms = new MergeSort();

		ms.genArray(MergeSort.arraySize, MergeSort.dir);
		// System.out.println("Initial Array:" + Arrays.toString(ms.array));

		ms.mergeSort(0, arraySize - 1);

		// System.out.println("Final Array: " + Arrays.toString(ms.array));

		logger.log(Level.INFO, "Main routine completed");
	}
}
