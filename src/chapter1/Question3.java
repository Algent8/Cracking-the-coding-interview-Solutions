package chapter1;

public class Question3 {

	/*
	 * Question 1.3 URLify: Write a method to replace all spaces in a string with
	 * '%20'. You may assume that the given string has sufficient space at the end
	 * to hold the additional characters, and that you are given the "true" length
	 * of the string.
	 * 
	 */

	public static void main(String[] args) {

	}

	public static void replaceSpaces(char[] str, int trueLength) {
		int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
		int newIndex = trueLength - 1 + numberOfSpaces * 2;

		if (newIndex + 1 < str.length) {
			str[newIndex + 1] = '\0';
		}
		for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex -= 1) {
			if (str[oldIndex] == ' ') { // Insert %20
				str[newIndex] = '0';
				str[newIndex - 1] = '2';
				str[newIndex - 2] = '%';
				newIndex -= 3;
			} else {
				str[newIndex] = str[oldIndex];
				newIndex -= 1;
			}

		}
	}

	public static int countOfChar(char[] str, int start, int end, int target) {
		int count = 0;
		for (int i = start; i < end; i++) {
			if (str[i] == target) {
				count++;
			}
		}
		return count;
	}
}
