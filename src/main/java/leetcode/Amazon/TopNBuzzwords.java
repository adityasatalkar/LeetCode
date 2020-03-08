package leetcode.Amazon;

import java.util.*;

public class TopNBuzzwords {

	public static HashMap<String, Integer> populateHashMap(String[] toys) {
		HashMap <String, Integer> hashMap = new HashMap<>();
		for (String toy: toys) {
			if (hashMap.containsKey(toy)) {
				int value = hashMap.get(toy);
				value++;
				hashMap.put(toy.toLowerCase(), value);
			}
			else {
				hashMap.put(toy.toLowerCase(), 0);
			}
		}
		return hashMap;
	}

	public static List<String> returnTopToys(int numToys, int topToys, String[] toys, int numQuotes, String[] quotes) {

		List<String> result = new ArrayList<>();
		if(numToys == 0||numQuotes == 0) {
			return result;
		}

		HashMap<String, Integer> hashMap = populateHashMap(toys);

		for (String quote: quotes) {
			quote.replaceAll("[\\?!@,;.]","");
			String[] stringArray = quote.split(" ");
			for (String word: stringArray) {
				if(word != null || word.length() > 0) {
					String lowerCaseWord = word.toLowerCase();
					if (hashMap.containsKey(lowerCaseWord)) {
						hashMap.put(lowerCaseWord, hashMap.get(lowerCaseWord) + 1);
					}
				}
			}
		}

		System.out.println(hashMap);

		List<Map.Entry<String, Integer>> entryList= new ArrayList<>(hashMap.entrySet());

		Collections.sort(entryList, (a, b) -> (b.getValue() - a.getValue()) != 0 ? (b.getValue() - a.getValue()) : a.getKey().compareTo(b.getKey()));
		for (int i = 0; i < entryList.size() && topToys > 0; i++, topToys--) {
			result.add(entryList.get(i).getKey());
		}

		return result;
	}

	public static void main(String[] args) {
		int numToys = 6;
		int topToys = 2;
		String[] toys = {"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
		int numQuotes = 6;
		String[] quotes = {"Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
				"The new Elmo dolls are super high quality",
				"Expect the Elsa dolls to be very popular this year, Elsa!",
				"Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
				"For parents of older kids, look into buying them a drone",
				"Warcraft is slowly rising in popularity ahead of the holiday season"};

		List<String> result = returnTopToys(numToys, topToys, toys, numQuotes, quotes);
		System.out.println(result);
	}
}
