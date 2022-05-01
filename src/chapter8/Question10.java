package chapter8;

public class Question10 {

	enum Color {
		Black, White, Red, Yellow, Green
	}

	boolean PaintFill(Color[][] screen, int row, int col, Color newColor) {
		if (screen[row][col] == newColor) {
			return false;
		}
		return PaintFill(screen, row, col, screen[row][col], newColor);
	}

	private boolean PaintFill(Color[][] screen, int row, int col, Color oldColor, Color newColor) {
		if (row < 0 || row >= screen.length || col < 0 || col >= screen[0].length) {
			return false;
		}

		if (screen[row][col] == oldColor) {
			screen[row][col] = newColor;
			PaintFill(screen, row - 1, col, oldColor, newColor); // go up
			PaintFill(screen, row + 1, col, oldColor, newColor); // go down
			PaintFill(screen, row, col - 1, oldColor, newColor); // go left
			PaintFill(screen, row, col + 1, oldColor, newColor); // go right
		}
		return true;
	}

}
