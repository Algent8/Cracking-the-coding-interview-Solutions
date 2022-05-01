package chapter7_Question1;

public enum Suit {
	Club(0), Diamond(1), Heart(2), Spade(3);

	private int value;

	private Suit(int v) {
		value = v;
	}

	public int getValue() {
		return value;
	}
	
	public static Suit getSuitFromValue(int value) {
		return null;
	}
}
