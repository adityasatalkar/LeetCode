package leetcode.FAANG;

public class PowOfXN {

	public static double bruteForce_MyPow(double x, int n) {
		double result = 1d;
		if (n == 1) {
			return result;
		}
		if (n == 0) {
			return 1d;
		}

		long N = n;

		if (N < 0) {
			x = 1 / x;
			N = -N;
		}

		for (long i = 0; i < N; i++) {
			result = result * x;
		}

		return result;
	}

	private static double fastPow(double x, long n) {
		if (n == 0) {
			return 1.0;
		}
		double half = fastPow(x, n / 2);
		if (n % 2 == 0) {
			return half * half;
		} else {
			return half * half * x;
		}
	}
	public static double myPow(double x, int n) {
		long N = n;
		if (N < 0) {
			x = 1 / x;
			N = -N;
		}

		return fastPow(x, N);
	}

	public static void main(String[] args) {
		System.out.println(myPow(2.0000,-2));
	}
}
