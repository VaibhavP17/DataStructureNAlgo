package com.example.dsa.linkedlist.intersection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IntersectionExample {

	public static void main(String[] args) {
		Node<Integer> list1 = new Node<Integer>();
		list1.setValue(20);
		
		Node<Integer> node1 = new Node<Integer>();
		node1.setValue(60);
			
		Node<Integer> node2 = new Node<Integer>();
		node2.setValue(90);
				
		Node<Integer> node3 = new Node<Integer>();
		node3.setValue(45);
				
		Node<Integer> node4 = new Node<Integer>();
		node4.setValue(23);
		node4.setNext(null);
		
		list1.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		Node<Integer> list2 = new Node<Integer>();
		list2.setValue(9);
		
		Node<Integer> point1 = new Node<Integer>();
		point1.setValue(5);
				
		Node<Integer> point2 = new Node<Integer>();
		point2.setValue(8);
				
		list2.setNext(point1);
		point1.setNext(point2);
		point2.setNext(node3);	
		
		getIntersection(list1, list2);
		
	}
	
	public static void getIntersection(Node<Integer> list1, Node<Integer> list2){
		final Integer constant = 1;
		Map<Node<Integer>, Integer> map = new IdentityHashMap<Node<Integer>, Integer>();
		while(list1 != null){
			Node<Integer> current = list1;
			map.put(current, constant);
			list1 = list1.getNext();
		}
		
		while(list2 != null){
			Node<Integer> current = list2;
			if(map.containsKey(current)){
				System.out.println("Intesecting Node, value: "+current.getValue());
				break;
			}
			list2 = list2.getNext();
		}
		
		
	}
	

}
