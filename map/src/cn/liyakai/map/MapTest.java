package cn.liyakai.map;

import java.util.*;

/*
 * This program demonstrates the use of a map with key type String and value type String.
 * */
public class MapTest {
	public static void main(String[] args){
		Map<String, String> staff = new HashMap<>();
		staff.put("144-25-5464", "Amy Lee");
		staff.put("567-24-2546", "Harry Hacker");
		staff.put("157-62-7935", "Gary Copper");
		staff.put("456-62-5527", "Francesca Cruz");
		
		// print all entries
		System.out.println(staff);
		
		//remove an entry
		staff.remove("567-24-2546");
		
		//replace an entry
		staff.put("456-62-527", "Francesca Miller");
		
		//look up a value
		System.out.println(staff.get("157-62-7935"));
		
		//iterate through all entries
		for (Map.Entry<String, String> entry : staff.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
		
	}
}
