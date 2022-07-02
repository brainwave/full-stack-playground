package com.olympusfullstack.searching;
import java.util.Scanner;

public class LinearSearch {
	
	private int[] genArray(int arraySize) {	
		int[] array = new int[arraySize];
		
		for (;arraySize>0;--arraySize) {
			array[arraySize-1]= arraySize;
		}
		
		return array;
	}
	
	private void searchArray(int[] array, int searchValue) {
		for(int i = 0; i< array.length; i++) {
			if(array[i] == searchValue) {
				System.out.println("Number "+searchValue+" found at position "+i+" in array "+array);
				return;
			}
		}
		System.out.println("Number "+searchValue+" not found in the array "+array+" of size "+array.length);
	
	}

	public static void main(String[] args) {
		LinearSearch bs = new LinearSearch();
		
		final long startTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter array size and number to search(in that order): ");		
		bs.searchArray(bs.genArray(sc.nextInt()),sc.nextInt());
		
		sc.close();
		
		final long endTime = System.currentTimeMillis();
		
		System.out.println("program execution time: "+(endTime - startTime));
	}
}