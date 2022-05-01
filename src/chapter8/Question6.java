package chapter8;

import java.util.Stack;

public class Question6 {

}

class Tower {
	private Stack<Integer> disks = new Stack<Integer>();

	public void add(int i) {
		if (!disks.isEmpty() && disks.peek() <= i) {
			System.out.println("Cannot place disk " + i);
		} else {
			disks.push(i);
		}
	}

	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
	}

	public void moveDisks(int q, Tower dest, Tower buf) {
		if (q <= 0) {
			return;
		}
		moveDisks(q - 1, buf, dest);
		moveTopTo(dest);
		buf.moveDisks(q - 1, dest, this);
	}
}
