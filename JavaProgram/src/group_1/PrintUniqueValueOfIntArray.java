package group_1;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintUniqueValueOfIntArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 11, 22, 3, 4, 5, 6, 7, 8 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i]))
				map.put(arr1[i], map.get(arr1[i]) + 1);
			else
				map.put(arr1[i], 1);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]))
				map.put(arr2[i], map.get(arr2[i]) + 1);
			else
				map.put(arr2[i], 1);
		}
		/*
		 * Set<Entry<Integer, Integer>> set = map.entrySet(); for (Entry<Integer,
		 * Integer> entry : set) { if (entry.getValue() == 1) {
		 * System.out.println("Unique value between Array : " + entry.getKey()); } else
		 * { System.out.println("Common element : " + entry.getKey() + " is present " +
		 * entry.getValue() + " Times"); }
		 * 
		 * }
		 */
		map.forEach((key, value) -> {
			if (value > 1)
//				System.out.println("Common element : " + key + " is present " + value + " Times");
//
//			else
				System.out.println("Unique value between Array : " + key);

		});
	}

}
