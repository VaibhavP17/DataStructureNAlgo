package com.example.dsa.insertion.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class InsertionSort {

	public static void main(String[] args) {

		Random random = new Random();
		random.setSeed(1);
		List<Integer> list = new ArrayList<Integer>();
		IntStream.range(0, 10).forEach(x -> {
			list.add(random.nextInt(100));
		});
		Integer[] arr = list.toArray(new Integer[list.size()]);

		System.out.println("Before sorting: " + Arrays.toString(arr));
		sort(arr);
		System.out.println("After sorting: " + Arrays.toString(arr));
	}

	public static void sort(Integer[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

}
