package algorithms_and_ds;

import java.util.Arrays;

public class SnippetBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) // generate array
			arr[i] = 10 - i;

		int left = 0;
		int mid = 5;
		int right = 10;

		int leftLen = mid - left;
		int rightLen = right - mid - 1;

		System.out.println("Left length: " + leftLen);
		System.out.println("Right Length: " + rightLen);

		int[] leftArr = Arrays.copyOfRange(arr, left, mid);
		int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right);

		System.out.println(Arrays.toString(leftArr));
		System.out.println(Arrays.toString(rightArr));

		int i = 0;
		int j = 0;
		int k = left;

		while (i < right - left) {
			System.out.println(i++);
		}
	}
}
