package chapter3;

import java.util.Stack;

public class Question4 {

	public static void main(String[] args) {
		// Implement a MyQueue class which implements a queue with two stacks
	}

	public class Queue<T> {
		Stack<T> s1;
		Stack<T> s2;

		public Queue() {
			s1 = new Stack<T>();
			s2 = new Stack<T>();
		}

		public int size() {
			return s1.size() + s2.size();
		}

		public void add(T val) {
			s1.push(val);
		}

		public void stackShift() {
			if (s2.isEmpty()) {
				while (!s1.isEmpty()) {
					s2.push(s1.pop());
				}
			}
		}

		public T peek() {
			stackShift();
			return s2.peek();
		}

		public T remove() {
			stackShift();
			return s2.pop();
		}

	}

}
