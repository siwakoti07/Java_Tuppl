package com.pack.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTester {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		System.out.println("is map empty  ? : " + map.isEmpty());
		System.out.println("Size of map : " + map.size());

		map.put(101, "Abc");
		map.put(102, "Xyz");
		map.put(103, "Pqr");
		map.put(104, "Def");
		map.put(105, "JKL");

		System.out.println("Size of map : " + map.size());

		System.out.println("map contains 102 key ? : " + map.containsKey(102));
		System.out.println("map contains 106 key ? : " + map.containsKey(106));

		System.out.println("map contains Abc ? : " + map.containsValue("Abc"));
		System.out.println("map contains ABC ? : " + map.containsValue("ABC"));

		System.out.println("is map empty  ? : " + map.isEmpty());

		// map.clear();

		System.out.println("is map empty after using clear() method ? : " + map.isEmpty());

		System.out.println("=================Map View for keys===================================");

		// print keySet of map
		Set set = map.keySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=================Map View for values===================================");

		// print value of map
		Collection<String> collection = map.values();
		Iterator<String> itrString = collection.iterator();
		while (itrString.hasNext()) {
			System.out.println(itrString.next());
		}

		System.out.println("=================Map View for key-value===================================");
		Set setKeyValue = map.entrySet();
		Iterator itrKeyValue = setKeyValue.iterator();
		while (itrKeyValue.hasNext()) {
			Map.Entry m = (Map.Entry) itrKeyValue.next();
			System.out.println(m.getKey() + " : " + m.getValue());
		}

	}

}

