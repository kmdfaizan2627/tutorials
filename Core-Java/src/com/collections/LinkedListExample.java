package com.collections;

import java.util.LinkedList;
import java.util.List;
// In ArrayList shifting takes pleace after deletion or insertion
// But in linked list there is no shifting happens in nodes. So it is faster.
// Searching is faster in array list because dure random access.
public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList(); // We will always take wrapper class like Integer, String etc
		//LinkedList<Integer> intList = new LinkedList<Integer>();
		list.add(10); // 0 index
		list.add(20); // 1 index
		list.add(2); // 2 index
		list.add(42); // 3 index
		System.out.println(list);
		//Iterating each element and comparing with and printing.
		for(Integer value : list) {
			if(value == 2) {
				System.out.println("2 exists in List");
			}else {
				System.out.println("2 does not exists in List");
			}
		}
		// At one time checking in  entire list
		if(list.contains(2)) {
			System.out.println("--- 2 exists in List -----");
		}else {
			System.out.println("---2 doest not exists in List");
		}
		
		System.out.println("Size of list before removal "+list.size());
		
		list.remove(2);
		System.out.println("----- After removal of 2nd index value ---"+list);
		System.out.println("Size of list after removal "+list.size());
		
		list.set(0, 9); // putting 9 at 0 index
		System.out.println(list);
		
	}

}

