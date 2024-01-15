package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
// In HashMap we can not have duplicate keys but values can be duplicate
// In HashMap we can have only one null key and value
public class HashMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		map.put("Afzal", 16);
		map.put("shahbaz", 2);
		map.put("suman", 20);
		map.put("suman", 20);
		map.put(null, null);
		System.out.println(map);
		for(Entry<String, Integer> obj : map.entrySet()) {
			System.out.println(obj.getKey()+ "   "+obj.getValue());
		}
		System.out.println("------------"+map.get("Afzal"));
		System.out.println("----/------"+map.remove("Afzal"));
	}

}
