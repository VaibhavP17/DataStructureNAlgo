package com.example.dsa.binary.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class BinarySearchExample {

	public static void main(String[] args) {
		Integer[] arr = getSortedInput();
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 88));
	}

	private static Integer[] getSortedInput() {
		Random random = new Random();
		random.setSeed(1);
		List<Integer> list = new ArrayList<Integer>();
		IntStream.range(0, 10).forEach(x -> {
			list.add(random.nextInt(100));
		});
		Collections.sort(list);
		return list.toArray(new Integer[list.size()]);
	}

	private static Integer binarySearch(Integer[] arr, Integer key) {

		return loop(arr, 0, arr.length - 1, key);
	}

	private static Integer loop(Integer[] arr, int low, int high, int key) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (arr[mid] == key)
			return mid;
		if (arr[mid] > key)
			return loop(arr, low, mid - 1, key);
		return loop(arr, mid + 1, high, key);
	}
}
