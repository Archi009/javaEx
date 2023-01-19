package com.yedam.java.ch03.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 Entry 수 : " + map.size());
//	같은 Key 값을 집어넣으면 기존에 있던 Key의 value를 지우고 새로운 value를 넣는다
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		Set<String> keySet = map.keySet();
		for (String name : keySet) {
			int score = map.get(name);
			System.out.println("\t" + name + ":" + score);

		}
		System.out.println();

		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+ map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer>entry = entryIterator.next();
			
			
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		
		
		
	}
}
