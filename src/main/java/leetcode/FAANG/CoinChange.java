package leetcode.FAANG;

import java.util.*;

public class CoinChange {



	public static int coinChange(int[] coins, int amount) {
		if (coins.length == 1 && amount % coins[0] != 0) {
			return -1;
		}

		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		return calculate(coins,amount, set, list);
	}

	public static int calculate(int[] coins, int amount, Set<Integer> set, List<Integer> list) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		int largestDenomination = 0;
		int divide = 0;
		for (int i = 0; i < coins.length; i++) {
			set.add(coins[i]);
			if (coins[i] > largestDenomination && coins[i] <= amount) {
				largestDenomination = coins[i];
				divide = amount / largestDenomination;
				hashMap.put(coins[i], divide);
			}
		}

		for (int i = 0; i < divide; i++) {
			list.add(largestDenomination);
		}

		System.out.println(hashMap);
		System.out.println(list);
		set.remove(largestDenomination);

		int remainingChange = amount - (largestDenomination * divide);

		Integer[] newCoins = set.stream().toArray(Integer[]::new);
		int[] coinsArray = new int[newCoins.length];

		for (int i = 0; i < newCoins.length; i++) {
			coinsArray[i] = newCoins[i];
		}

		if (hashMap.size() == 0) {
			return list.size();
		}

		if (remainingChange != 0) {
			calculate(coinsArray,remainingChange, set, list);
		}
		return list.size();
	}

	public static void main(String[] args) {
		int[] coins1 = {1, 2, 5};
		int amount1 = 18;
		System.out.println(coinChange(coins1,amount1));

		int[] coins2 = {2};
		int amount2 = 3;
		System.out.println(coinChange(coins2,amount2));

		int[] coins3 = {186,419,83,408};
		int amount3 = 6249;
		System.out.println(coinChange(coins3,amount3));

		int[] coins4 = {2};
		int amount4 = 18;
		System.out.println(coinChange(coins4,amount4));

		int[] coins5 = {2};
		int amount5 = 19;
		System.out.println(coinChange(coins5,amount5));
	}
}
