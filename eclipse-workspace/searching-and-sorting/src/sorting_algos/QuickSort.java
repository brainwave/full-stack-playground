package sorting_algos;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import algorithms_and_ds.Array;

public class QuickSort extends Array {

	// some constants and static members.
	static public final int arraySize = 107374182; // java VM for some reason supports only 2^30 as maximum
	// array
	// size
	static public Logger logger = Logger.getLogger(QuickSort.class.getName()); // static logger for all objects of
																				// MergeSort class
	static public final int dir = -1;

	// Constructor
	QuickSort() {
		super(arraySize); // create array of maximum size
		logger.log(Level.INFO, "QuickSort object instantiated successfully");
	}

	private void quickSort(int left, int right) {
		//System.out.println("left: "+left+" right: "+right);
		if (left < right) {
			int p_index = this.partition(left, right);
			//System.out.println("index: "+p_index);
			quickSort(left, p_index-1);
			//System.out.println("Array: "+Arrays.toString(this.array));
			quickSort(p_index+1, right);
			//System.out.println("Array: "+Arrays.toString(this.array));
		}
	}
	
	private int partition(int left, int right) {
		int pivot = this.array[left+(right-left)/2]; //wow. Simple change makes the algo actually function fine for this large array!
		int i = left - 1;
		for (int j = left; j<= right-1; j++ )
			if (this.array[j] < pivot)
				this.swap(++i, j);
		swap(++i, right);
		return i;
	}
	
	private void swap(int i, int j) {
		if(i!=j) {
			int temp = this.array[i];
			this.array[i] = this.array[j];
			this.array[j] = temp;
		}
	}

	public static void main(String[] args) {
		// set level to info for detailed logs
		logger.setLevel(Level.INFO);

		QuickSort ms = new QuickSort();

		ms.genArray(QuickSort.arraySize, QuickSort.dir);
		//System.out.println("Initial Array:" + Arrays.toString(ms.array));

		ms.quickSort(0, arraySize - 1);

		//System.out.println("Final Array: " + Arrays.toString(ms.array));

		logger.log(Level.INFO, "Main routine completed");
	}
}
