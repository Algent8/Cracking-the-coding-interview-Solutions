package chapter1;

import java.util.Arrays;

public class Question2 {

	/*
	 * Question 1.2 Check Permutation: Given 2 Strings, write a method to decide if
	 * one is a permutation of the other.
	 * 
	 */

	public static void main(String[] args) {
		String str = "abc";
		String str2 = "cba";
		System.out.println(permutation(str, str2));
		System.out.println();

		String str3 = "abcd";
		String str4 = "cbaz";
		System.out.println(permutation(str3, str4));
	}

	public static String sort(String s) { // Write a method that sorts a string using Arrays.sort
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static boolean permutation(String s, String t) { // Write a method that checks if two string permutate
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
}
