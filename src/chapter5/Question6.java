package chapter5;

public class Question6 {

	public static void main(String[] args) {

	}
	
	int bitFlipCount(int x, int y) {
		int count = 0;
		int z = x ^ y;
		while (z != 0) {
			count += z & 1; // If z ends with a 1 increment the count
			z >>>= 1; // Shift right by 1
		}
		return count;
	}

}
