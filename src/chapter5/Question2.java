package chapter5;

public class Question2 {

	public static void main(String[] args) {

	}

	String printBinary(double number) {
		if (number >= 1 || number <= 0) { // IF the number isn't between 0 and 1 return Error
			return "Error";
		}

		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while (number > 0) { // While the number is greater than 0 keep appending the binary String builder
								// until you get the answer
			if (binary.length() >= 32) { // If length of Binary is above 32 return Error
				return "Error";
			}

			double d = number * 2;
			if (d >= 1) {
				binary.append(1);
				number = d - 1;
			} else {
				binary.append(0);
				number = d;
			}
		}
		return binary.toString();
	}

}
