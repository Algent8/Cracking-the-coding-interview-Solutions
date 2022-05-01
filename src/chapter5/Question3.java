package chapter5;

public class Question3 {

	int flipBit(int i) {
		if (~i == 0) {
			return Integer.BYTES * 8;
		}

		int curLength = 0;
		int preLength = 0;
		int maxLength = 1;

		while (i != 0) {
			if ((i & 1) == 1) {
				curLength++;
			} else if ((i & 1) == 0) {
				preLength = (i & 2) == 0 ? 0 : curLength;
				curLength = 0;
			}
			maxLength = Math.max(preLength + curLength + 1, maxLength);
			i >>>= 1;
		}
		return maxLength;
	}
}
