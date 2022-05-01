package chapter8;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;

public class Question2 {
	ArrayList<Point> getPath(boolean[][] maze) {
		if (maze == null || maze.length == 0) {
			return null;
		}

		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> failedPoints = new HashSet<Point>();
		if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
			return path;
		}
		return null;
	}

	private boolean getPath(boolean[][] maze, int row, int column, ArrayList<Point> path, HashSet<Point> failedPoints) {
		if (row < 0 || column < 0 || !maze[row][column]) {
			return false;
		}

		Point p = new Point(row, column);

		if (failedPoints.contains(p)) {
			return false;
		}

		boolean isAtOrgin = (row == 0) && (column == 0);

		if (isAtOrgin || getPath(maze, row, column - 1, path, failedPoints)
				|| getPath(maze, row - 1, column, path, failedPoints)) {
			path.add(p);
			return true;
		}

		failedPoints.add(p);
		return false;

	}

}
