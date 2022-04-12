package com.lab.currency.denomination;

public class MergeSort {

	public static void sort(int array[], int startIndex, int endIndex) {
		if (startIndex < endIndex) {

			int middle = startIndex + (endIndex - startIndex) / 2;
			sort(array, startIndex, middle);
			sort(array, middle + 1, endIndex);
			merge(array, startIndex, middle, endIndex);
		}
	}

	public static void merge(int array[], int startIndex, int middle, int endIndex) {

		int i = 0;
		int j = 0;
		int x = startIndex;
		int len1 = middle - startIndex + 1;
		int len2 = endIndex - middle;
		

		int[] leftArray = new int[len1];
		int[] rightArray = new int[len2];

		for (int k = 0; i < len1; k++) {
			leftArray[k] = array[startIndex + k];
		}

		for (int k = 0; k < len2; k++) {
			rightArray[k] = array[middle + k + 1];
		}

		while (i < len1 && j < len2) {
			if (leftArray[i] >= rightArray[j]) {
				array[x] = leftArray[i];
				i++;
			} else {
				array[x] = rightArray[j];
				j++;
			}
			x++;
		}
		while (i < len1) {
			array[x] = leftArray[i];
			i++;
			x++;
		}

		while (i < len2) {
			array[x] = leftArray[j];
			j++;
			x++;
		}

	}

}
