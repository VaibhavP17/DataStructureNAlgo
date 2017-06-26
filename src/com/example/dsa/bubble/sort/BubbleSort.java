package com.example.dsa.bubble.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//int[] arr = {5,2,7,4,9,10,8,3,6,1,56, 23, 89, 12, 45, 34};
		int[] arr = {1,2,3,4,5,10,7,9,8,6};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr){
		int arrayLength = arr.length;
		int secondLastElementIndex = arrayLength - 2;
		boolean swapped = false;
		do{
			swapped = false;
			for(int i=0; i<=secondLastElementIndex; i++){
				if(arr[i] > arr[i+1]){
					arr[i] = arr[i] - arr[i+1];
					arr[i+1] = arr[i] + arr[i+1];
					arr[i] = arr[i+1] - arr[i];
					swapped = true;
				}
			}
			--secondLastElementIndex;
		}while(swapped);		
	}

}
