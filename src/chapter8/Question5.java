package chapter8;

public class Question5 {

	public static void main(String[] args) {
		System.out.println(multRec(10, 5));
	}

	public static int multRec(int x, int y) {

		if (y == 1) {
			return x;
		}

		return x + multRec(x, y - 1);
	}

}
