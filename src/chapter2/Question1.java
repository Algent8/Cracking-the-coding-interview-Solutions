package chapter2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Question1 {

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(0);
		linkedList.add(1);
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList = deleteDuplicatesFromLinkedList(linkedList);
		
		linkedList.forEach((node) -> {
			System.out.println(node);
		});
	

	}

	
	public static List<Integer> deleteDuplicatesFromLinkedList(List<Integer> linkedList) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < linkedList.size(); i++) {
			int number = linkedList.get(i);
			if(set.add(number) == true) {
				
			} else {
				linkedList.remove(i);
			}	
		}
		return linkedList;
	}
}
