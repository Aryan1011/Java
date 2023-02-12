package com.pkware.Collections;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> mp = new HashMap<>();
		mp.put("Ajay", 2);
		mp.put("Abhi", 1);
		mp.put("Akshit", 1);
		mp.put("Abhi", 3);
		mp.remove("Ajay");
		for(Map.Entry<String,Integer> e : mp.entrySet()) {
			System.out.println(e.getKey() + " "+ e.getValue());
		}
		
		if(mp.containsKey("Abhi")) {
			Integer a = mp.get("Abhi");
			System.out.println(a);
		}
		System.out.println(mp.containsValue(3));
	
//		LinkedHashMap maintains order while Hashmap doesnt
//		TreeMap is same but comparator can also be provided
//		hashTable is synchronized
		
	}

}
