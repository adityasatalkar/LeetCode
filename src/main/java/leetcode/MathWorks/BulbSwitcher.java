package leetcode.MathWorks;

public class BulbSwitcher {

	private static boolean isOn(int x) {
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		return count % 2 == 1;
	}

	public static int bulbSwitchMethodOne(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++ ) {
			if (isOn(i)) count++;
		}
		return count;
	}

	// OR METHOD 2
	public static int bulbSwitchMethodTwo(int n) {
		return (int) Math.sqrt(n);
	}

	public static void main(String[] args) {
		System.out.println(bulbSwitchMethodOne(3));
		System.out.println(bulbSwitchMethodTwo(3));
	}
}
