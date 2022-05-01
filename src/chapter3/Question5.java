package chapter3;

import java.util.Stack;

public class Question5 {

	public static void main(String[] args) {

	}

	public void sort(Stack<Integer> s) {
		Stack<Integer> s2 = new Stack<Integer>();
		while (!s.isEmpty()) {
			int temp = s.pop();
			while (s2.isEmpty() && s2.peek() > temp) {
				s.push(s2.pop());
			}
			s2.push(temp);
		}

		while (!s2.isEmpty()) {
			s.push(s2.pop());
		}
	}

}
