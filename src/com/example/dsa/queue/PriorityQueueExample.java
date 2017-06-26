package com.example.dsa.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String[] args){
		Queue<Integer> queue = new PriorityQueue<Integer>(5);
		System.out.println(queue.size());
		queue.offer(8);
		queue.offer(4);
		queue.offer(9);
		System.out.println(queue.toString());
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		
	}

}
