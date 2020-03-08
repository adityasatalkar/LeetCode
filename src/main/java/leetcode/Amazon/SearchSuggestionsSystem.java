package leetcode.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {

	public static void printListOfLists(List<List<String>> result) {
		for (int i = 0; i < result.size(); i++) {
			List<String> list = result.get(i);
			for (String product: list) {
				System.out.print(product + " ");
			}
			System.out.println();
		}
	}

	public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
		List<List<String>> result = new ArrayList<>();
		Arrays.sort(products);
		List<String> productsList = Arrays.asList(products);

		for (int i = 0; i < searchWord.length(); i++) {
			String subString = searchWord.substring(0,i);
			List<String> wordsFound = new ArrayList<>();

			productsList.forEach(product -> {
				if (product.startsWith(subString)) {
					wordsFound.add(product);
				}
			});

			productsList = wordsFound;
			if (wordsFound.size() > 3) {
				result.add(wordsFound.subList(0, 3));
			}
			else {
				result.add(wordsFound);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] products1 = {"mobile","mouse","moneypot","monitor","mousepad"};
		String searchWord1 = "mouse";
		List<List<String>> result1 = suggestedProducts(products1, searchWord1);

		String[] products2 = {"havana"};
		String searchWord2 = "havana";
		List<List<String>> result2 = suggestedProducts(products2, searchWord2);

		String[] products3 = {"bags","baggage","banner","box","cloths"};
		String searchWord3 = "bags";
		List<List<String>> result3 = suggestedProducts(products3, searchWord3);

		String[] products4 = {"havana"};
		String searchWord4 = "tatiana";
		List<List<String>> result4 = suggestedProducts(products4, searchWord4);

		printListOfLists(result1);
		System.out.println();
		printListOfLists(result2);
		System.out.println();
		printListOfLists(result3);
		System.out.println();
		printListOfLists(result4);
	}
}
