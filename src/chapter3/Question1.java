package chapter3;

public class Question1 {

	public static void main(String[] args) {

	}

	public class MultipleStacks { // Class for MultipleStacks
		private int stackCount = 3; // Stack Count
		private int stackCapacity; // Max Stack Capacity
		private int[] values; // Values in the stack
		private int[] sizes; // Sizes

		public MultipleStacks(int size) { // Constructor for Multiple Stacks class
			stackCapacity = size;
			values = new int[size * stackCount];
			sizes = new int[stackCount];
		}

		public void push(int num, int value) {
			if (isFull(num)) {
				System.out.println("Stack is Full");

			} else {
				sizes[num]++;
				values[indexOfTop(num)] = value;
			}
		}

		public int pop(int num) {
			if (isEmpty(num)) {
				System.out.println("Stack is Empty");
				return -1;
			}
			int topIndex = indexOfTop(num);
			int value = values[topIndex];
			values[topIndex] = 0;
			sizes[num]--;
			return value;

		}

		public int peek(int num) {
			if (isEmpty(num)) {
				System.out.println("Stack is Empty");
				return -1;
			}
			return values[indexOfTop(num)];
		}

		public boolean isEmpty(int num) {
			return sizes[num] == 0;
		}

		public boolean isFull(int num) {
			return sizes[num] == stackCapacity;
		}

		private int indexOfTop(int num) {
			int offset = num * stackCapacity;
			int size = sizes[num];
			return offset + size - 1;
		}

	}

}
