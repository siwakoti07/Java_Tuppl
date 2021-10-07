package com.pack.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTester {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Abc");
		map.put(102, "Xyz");
		map.put(103, "Pqr");
		map.put(null, "ppp"); // why null as key printed in first position in output
		map.put(104, "Def");
		map.put(105, "JKL");
		map.put(103, "SQW");
		map.put(null, "ddf");
		map.put(106, null);
		map.put(107, null);
		map.put(108, null);
		map.put(109, null);

		Set setKeyValue = map.entrySet();
		Iterator itrKeyValue = setKeyValue.iterator();
		while (itrKeyValue.hasNext()) {
			Map.Entry m = (Map.Entry) itrKeyValue.next();
			System.out.println(m.getKey() + " : " + m.getValue());
		}

	}

}

