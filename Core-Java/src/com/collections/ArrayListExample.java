package com.collections;

import java.util.*;

// Array is of fixed(static) length but ArrayList is dynamic in nature.
// It implements List interface
//interface F1{
//	
//}
//class F2 implements F1{
//	public static void main(String[] args) {
//		F1 obj = new F2();
//		F2 obj1 = new F2();
//	}
//}


public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(); // We will always take wrapper class like Integer, String etc
		//ArrayList<Integer> intList = new ArrayList<Integer>();
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
