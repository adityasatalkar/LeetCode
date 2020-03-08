package leetcode.Microsoft;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {
		List<String> fizzBuzz = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			boolean mod3 = i % 3 == 0;
			boolean mod5 = i % 5 == 0;
			if (mod3 && mod5) {
				fizzBuzz.add("FizzBuzz");
			}
			else if (mod3) {
				fizzBuzz.add("Fizz");
			}
			else if (mod5) {
				fizzBuzz.add("Buzz");
			}
			else {
				fizzBuzz.add(String.valueOf(i));
			}
		}
		return fizzBuzz;
	}

	public static void main(String[] args) {

		List<String> fizzBuzz = fizzBuzz(15);
		for (String current: fizzBuzz) {
			System.out.println(current);
		}
	}
}
