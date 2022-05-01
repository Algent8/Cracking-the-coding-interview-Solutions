package chapter3;

import java.util.Stack;

public class Question2 {

	public static void main(String[] args) {
		// How to design a stack which, in addition to push and pop has a function min
		// which return the minimum element.
	}

	public class StackWithMinimum extends Stack<NodeWithMinimum> {
		public void push(int value) {
			int newMin = Math.min(value, min());
			super.push(new NodeWithMinimum(value, newMin));
		}

		public int min() {
			if (this.isEmpty()) {
				return Integer.MAX_VALUE;
			} else {
				return peek().min;
			}

		}

	}

	class NodeWithMinimum {
		public int value;
		public int min;

		public NodeWithMinimum(int value, int min) {
			this.value = value;
			this.min = min;
		}
	}

	// Create another stack class that keeps track of the mins in order to save
	// space

	public class StackWithMinimum2 extends Stack<Integer> {
		Stack<Integer> s2;

		public StackWithMinimum2() {
			s2 = new Stack<Integer>();
		}

		public void push(int val) {
			if (val <= min()) {
				s2.push(val);
			}
			super.push(val);
		}

		public Integer pop() {
			int val = super.pop();
			if (val == min()) {
				s2.pop();
			}
			return val;
		}

		public int min() {
			if (s2.isEmpty()) {
				return Integer.MAX_VALUE;
			} else {
				return s2.peek();
			}
		}
	}

}
