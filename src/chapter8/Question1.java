package chapter8;

//Question: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.
public class Question1 {
	public int countWays(int number) { // use recursions to get result
		if (number < 0) { // if the number is negative return 0
			return 0;
		} else if (number == 0) { // if the number is 0 return 1
			return 1;
		} else { // if the number is 1 or more count the ways of 1 step, 2 steps and 3 steps and
					// add them all together
			return countWays(number - 1) + countWays(number - 2) + countWays(number - 3);
		}

	}

}
