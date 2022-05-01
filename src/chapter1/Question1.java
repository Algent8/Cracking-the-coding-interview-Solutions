package chapter1;

public class Question1 {
	/*
	 * 1.1: Is Unique: Implement an algorithm to determine if a string has all
	 * unique characters. What if you cannot use additional data structures.
	 * 
	 */
	public static void main(String[] args) {
		String str = "abc123";
		System.out.println(isUniqueChars(str));
		System.out.println();
		str = "aabc123";
		System.out.println(isUniqueChars(str));

	}

	// Solution
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) { // Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	/*
	 * The time complexity is 0(n) where n is the length of the string. The space
	 * complexity is O(1).
	 * 
	 * If we can't use additional data structures, we can solve this by comparing
	 * every character of the string to every other character of the string which
	 * will take O(n^2) time and O(1) space.
	 * 
	 * You could also sort the string in O(nlog(n)) time then linearly check the
	 * string for neighboring characters that are identical.
	 * 
	 */

}
