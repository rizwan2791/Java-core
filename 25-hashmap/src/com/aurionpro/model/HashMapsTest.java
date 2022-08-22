package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;

public class HashMapsTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Rizwan","Rizwan1234");
		map.put("Sarah","Sarah1234");
		map.put("Kaif","Kaif1234");
		map.put("Zean","Zean1234");
		map.put("Zean","Zean123467"); //No duplicate entry
		System.out.println(map);
		System.out.println(map.get("Rizwan"));
		for(Map.Entry<String,String> m:map.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		map.put("Zeanat","Zean12346");
		System.out.println(map);
		System.out.println("--------------------------------");
		HashMap<String,String> mapPut = new HashMap<String,String>();
		mapPut.put("Rahil","Rahil1234");
		mapPut.putAll(map);
		System.out.println(mapPut);
		System.out.println("----------------------------------");
		System.out.println("Initial HashMap : "+map);
		
		System.out.println(map.remove("xyz"));
		map.remove("Sarah","Sarah1234");
		System.out.println("Updated HashMap : "+map);
		System.out.println("----------------------------------");
		map.replace("Kaif","kaiffffffff");
		System.out.println("After Replacement "+map);
		map.replace("Kaif", "kaiffffffff", "kaif00098");
		System.out.println("After Replacement "+map);
		System.out.println("----------------------------------");
	};

}