package com.olympusfullstack.sorting;
import com.olympusfullstack.algorithms_and_ds.*;

import java.util.Arrays;
import java.util.logging.*;

public class MergeSort extends Array{	
	
	//some constants and static members. 
	static public final int arraySize = 3;//1073741824; //java VM for some reason supports only 2^30 as maximum array size
	static public Logger logger = Logger.getLogger(MergeSort.class.getName()); //static logger for all objects of MergeSort class
	static public final int dir = 1; 

	//Constructor
	MergeSort() {
		super(arraySize); //create array of maximum size
		logger.log(Level.INFO, "MergeSort object instantiated successfully");
	}
	
	private void mergeSort(int left, int right) {
		if(left < right) {
			int mid = left + (right - left)/2;
			
			mergeSort(left, mid);
			mergeSort(mid+1,right);
			merge(left, mid, right);
		}
		/*		
		 * else
		 * logger.log(Level.INFO, Integer.toString(left));
		*/
	}
	
	private void merge(int left, int mid, int right) {
		int[] leftSubArray = Arrays.copyOfRange(this.array, left, mid);
		int[] rightSubArray = Arrays.copyOfRange(this.array, mid+1, right);
	
		int i,j;
		i = j = 0;
		int k = left;
		
		while((i < (leftSubArray.length-1)) && j < (rightSubArray.length-1)) {
			if(leftSubArray[i] <= rightSubArray[i]) 
				this.array[k++] = leftSubArray[i++];
			else
				this.array[k++] = rightSubArray[j++];
			
			System.out.println(Integer.toString(i));
			System.out.println(Integer.toString(j));
			System.out.println(Integer.toString(k));
		}
		
		while(i < (leftSubArray.length - 1))
			this.array[k++] = leftSubArray[i++];
		
		while(j < (rightSubArray.length - 1))
			this.array[k++] = rightSubArray[j++];
			
			 
	}

	
	public static void main(String[] args) {
		//set level to info for detailed logs
		logger.setLevel(Level.INFO);
		
		MergeSort ms = new MergeSort();
		
		ms.genArray(MergeSort.arraySize, MergeSort.dir);
		ms.mergeSort(0, arraySize-1);
		
		System.out.println(Arrays.toString(ms.array));
		
		logger.log(Level.INFO, "Main routine completed");
	}
}
