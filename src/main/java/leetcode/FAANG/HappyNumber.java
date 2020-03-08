package leetcode.FAANG;

public class HappyNumber {

	public static boolean isHappy(int n) {
		if(n <= 9) {
			return n == 1 || n == 7;
		}

		int square = 0;

		while(n > 0) {
			square += (n % 10) * (n % 10);
			n = n / 10;
		}
		return isHappy(square);
	}

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
