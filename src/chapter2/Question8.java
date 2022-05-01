package chapter2;

import org.w3c.dom.Node;

public class Question8 {

	public static void main(String[] args) {

	}

	public static Node loopDetection(Node firstNode) {
		// Create two nodes that use the Node given in the function
		// the slow runner will iterate 1 at a time while the fast runner will go 2 at a time
		Node slowRunner = firstNode; 
		Node fastRunner = firstNode;
		
		while(fastRunner != null && fastRunner.getNextSibling() != null) {
			slowRunner = slowRunner.getNextSibling(); // 1x
			fastRunner = fastRunner.getNextSibling().getNextSibling(); // 2x
			if(slowRunner == fastRunner) { // if the runners are ever at the same node break out of the while loop
				break;	
			}
		}
		
		if(fastRunner.getNextSibling() == null || fastRunner.getNextSibling() == null) { // return nothing if there is no collision between the runners
			return null;
		}
		
		slowRunner = firstNode; // set Slow Runner to First Node
		
		while(slowRunner != fastRunner) { // Run a while loop until both runners meet at the Start of the Loop
			slowRunner = slowRunner.getNextSibling();
			fastRunner = fastRunner.getNextSibling();
			
		}
		return fastRunner; // Return fastRunner
	}

}
