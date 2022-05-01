package chapter2;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class Question5 {

	public static void main(String[] args) {

	}

	public static LinkedList<Node> addLinkedLists(Node node1, Node node2) { // function that calls
																			// addLinkedListsWithCarry and adds
		return addLinkedListsWithCarry(node1, node2, 0); // a carry
	}

	private static LinkedList<Node> addLinkedListsWithCarry(Node node1, Node node2, int carryOver) {
		if (node1 == null && node2 == null && carryOver == 0) { // If both nodes are empty and the carryOver is zero
			return null; // return null
		}

		LinkedList<Node> result = new LinkedList<Node>();

		int i = carryOver;

		if (node1 != null) { // If Node1 isn't empty set add value of Node1 to i
			i += Integer.valueOf(node1.getNodeValue());
		}

		if (node2 != null) { // If Node1 isn't empty set add value of Node2 to i
			i += Integer.valueOf(node2.getNodeValue());
		}

		if (node1 != null || node2 != null) {
			LinkedList<Node> extra = addLinkedListsWithCarry(node1 == null ? null : node1.getNextSibling(),
					node2 == null ? null : node2.getNextSibling(), i >= 10 ? 1 : 0);
			result.add(extra.getFirst());
		}
		return result;

	}

}
