package chapter2;

import org.w3c.dom.Node;

public class Question3 {

	public static void main(String[] args) {
		
	}
	
	public static boolean deleteNodeOtherThanFirstOrLast(Node node) {
		if(node == null || node.getNextSibling() == null) { // Checks to see if Node is empty or if the next one is empty
			return false;  									// returns false if node is empty or next one is empty
		}
		Node nextNode = node.getNextSibling();				// Gets the next node 	
		node = nextNode;									// Sets node value to next node
		return true;										
		
	}

}
