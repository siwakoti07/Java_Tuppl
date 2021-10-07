package com.pack.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTester {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("a", 1);
		map.put("x", 2);
		map.put("w", 3);
		map.put("g", 4);
		map.put("b", 5);
		map.put("n", 6);
		map.put("z", 7);
		map.put("j", 8);
		map.put(null, 8);
		
		//System.out.println(map);

		Set setKeyValue = map.entrySet();
		Iterator itrKeyValue = setKeyValue.iterator();
		while (itrKeyValue.hasNext()) {
			Map.Entry m = (Map.Entry) itrKeyValue.next();
			System.out.println(m.getKey() + " : " + m.getValue());
		}

	}

}

