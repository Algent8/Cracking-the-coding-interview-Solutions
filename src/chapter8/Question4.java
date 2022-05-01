package chapter8;

import java.util.ArrayList;

public class Question4 {
	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int idx) {
		ArrayList<ArrayList<Integer>> subsets;
		if (set.size() == idx) {
			subsets = new ArrayList<ArrayList<Integer>>();
			subsets.add(new ArrayList<Integer>());
		} else {
			subsets = getSubsets(set, idx + 1);
			int i = set.get(idx);
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> subset : subsets) {
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(i);
				moreSubsets.add(newSubset);
			}
			subsets.addAll(moreSubsets);
		}
		return subsets;
	}
}
