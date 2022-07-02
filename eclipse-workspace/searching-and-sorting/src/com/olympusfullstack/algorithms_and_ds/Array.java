package com.olympusfullstack.algorithms_and_ds;

public class Array {
	protected int[] array;
	
	protected Array(int arraySize) {
		this.array = new int[arraySize];
	}
	
	protected void genArray(int arraySize, int dir) {
		for (int i = 0;i<arraySize-1;++i)
				this.array[i] = dir>0?(i+1):(arraySize - i);
	}
}