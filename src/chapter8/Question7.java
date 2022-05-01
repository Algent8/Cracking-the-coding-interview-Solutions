package chapter8;

import java.util.ArrayList;

//Write a method to compute all permutations of a string of unique characters
public class Question7 {
	ArrayList<String> computePerm(String str) {
		ArrayList<String> result = new ArrayList<String>();
		computePerm("", str, result);
		return result;
	}

	private void computePerm(String prefix, String remainder, ArrayList<String> result) {
		if (remainder.length() == 0) {
			result.add(prefix);
		}

		int length = remainder.length();
		for (int i = 0; i < length; i++) {
			String before = remainder.substring(0, i);
			String after = remainder.substring(i + 1, length);
			char ch = remainder.charAt(i);
			computePerm(prefix + ch, before + after, result);
		}
	}

}
