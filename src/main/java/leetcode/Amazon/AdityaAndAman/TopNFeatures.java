package leetcode.Amazon.AdityaAndAman;

import java.util.*;

public class TopNFeatures {

	public static List<String> returnTopToys(int numToys, int topToys, String[] toys, int numQuotes, String[] quotes) {
		List<String> res = new ArrayList<>();
		if(numToys==0||numQuotes==0) return res;
		Map<String, Integer> map = new HashMap<>();
		for(String toy: toys) {
			map.put(toy, 0);
		}

		for(String quote: quotes) {
			String[] list = quote.split(" ");
			for(String e: list) {
				if(e!=null||e.length()>0) {
					String wordInLowerCase = e.toLowerCase();
					if(map.containsKey(wordInLowerCase)) {
						map.put(wordInLowerCase, map.get(wordInLowerCase)+1);
					}
				}
			}
		}


		List<Map.Entry<String, Integer>> entryList= new ArrayList<>(map.entrySet());

		Collections.sort(entryList, (a, b) -> (b.getValue() - a.getValue()) != 0 ? (b.getValue() - a.getValue()) : a.getKey().compareTo(b.getKey()));
		int i = 0;
		System.out.println(entryList.size());
		while (i < entryList.size() && topToys > 0) {
			topToys--;
			res.add(entryList.get(i).getKey());
			i++;
		}
		return res;
	}

	public static void main(String[] args) {
		int numToys = 6;
		int topToys = 2;
		String[] toys = {"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
		int numQuotes = 6;
		String[] quotes = {
				"Emo is the hottest of the season! Elmo will be on every kid's wishlist!",
				"The new Elmo dolls are super high quality",
				"Expect the Elsa dolls to be very popular this year",
				"Elsa and Elmo are the toys I'll be buying for my kids",
				"For parents of older kids, look into buying them a drone",
				"Warcraft is slowly rising in popularity ahead of the holiday season"};
		List<String> result = returnTopToys(numToys, topToys, toys, numQuotes, quotes);
		System.out.println(result.toString());
	}
}
