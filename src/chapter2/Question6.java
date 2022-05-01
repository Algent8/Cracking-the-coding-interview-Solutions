package chapter2;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class Question6 {

	public static void main(String[] args) {
		
	}
	
	public static boolean isPalindrome(Node firstNode) { 
		Node reversed = reverse(firstNode);  // get reversed node by calling reverse function 
		return isEqual(firstNode, reversed); // return by checking if the first node equals the reverse of it 
	}

	private static boolean isEqual(Node n1, Node n2) {
		while (n1 != null && n2 != null) {				// while both nodes are not empty iterate though the linkedLists
			if(n1.getNodeValue() != n2.getNodeValue()) {
				// If the values in each node are not equal return false
				return false;
			} 
			n1 = n1.getNextSibling(); // go to next node for first LinkedList
			n2 = n2.getNextSibling(); // go to next node for reversed LinkedLists
			
		}
		return n1 == null && n2 == null; // return true once u checked both LinkedLists to see if Palindrome
	}

	private static Node reverse(Node node) {
		Node firstNode = null;	//set first Node to false
		while(node != null) {	// while the node isnt empty clone the reverse of the linked list to another node
			Node n = node;
			Node next = n.getNextSibling();
			next = firstNode;
			firstNode = n;
			
			node = node.getNextSibling();
		}
		return firstNode; // return reversed Node
	}

}
