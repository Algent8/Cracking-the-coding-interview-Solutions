package chapter8;

import java.util.ArrayList;
import java.util.HashMap;

// Write a method to compute all permutations of a string whose characters are not necessarily unique. The list of permutations should not have duplicates
public class Question8 {

	ArrayList<String> computePerm(String str) {
		ArrayList<String> result = new ArrayList<String>();
		HashMap<Character, Integer> map = buildFreqTable(str);
		computePerm(map, "", str.length(), result);
		return result;

	}

	private void computePerm(HashMap<Character, Integer> map, String prefix, int leftover, ArrayList<String> result) {
		if (leftover == 0) {
			result.add(prefix);
			return;
		}

		for (Character c : map.keySet()) {
			int count = map.get(c);
			if (count > 0) {
				map.put(c, count - 1);
				computePerm(map, prefix + c, leftover - 1, result);
				map.put(c, count);
			}
		}
	}

	private HashMap<Character, Integer> buildFreqTable(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 0);
			}
			map.put(c, map.get(c) + 1);
		}
		return map;
	}
}
