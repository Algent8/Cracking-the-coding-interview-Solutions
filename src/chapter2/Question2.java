package chapter2;

import org.w3c.dom.Node;

public class Question2 {

	public static void main(String[] args) {
		
		
		
	}
	
	public static int kToLast(Node node, int k) {
		if(node == null) {
			return 0;
		}
		int idx = kToLast(node.getNextSibling(), k) + 1;
		if(idx == k) {
			System.out.println(k + "to the last node in the linked list is" + node.getNodeValue());
		}
		return idx;
		
	}
	
	

}
