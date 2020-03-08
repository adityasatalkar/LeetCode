package leetcode.MathWorks;

import java.util.*;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> listOfStringLists = new ArrayList<>();

		HashMap<String, List<String>> hashMap = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] charArray = strs[i].toCharArray();
			Arrays.sort(charArray);
			String sortedString = new String(charArray);
			if (!hashMap.containsKey(sortedString)) {
				List<String> value = new ArrayList<>();
				value.add(strs[i]);
				hashMap.put(sortedString,value);
			}
			else {
				List<String> hashMapValue = hashMap.get(sortedString);
				hashMapValue.add(strs[i]);
				hashMap.put(sortedString,hashMapValue);
			}
		}

		Set<String> keySet = hashMap.keySet();
		Object keyArray[]= keySet.toArray();
		for(int i = 0 ; i < keyArray.length ; i++) {
			List<String> stringList = hashMap.get(keyArray[i].toString());
			listOfStringLists.add(stringList);
		}
		return listOfStringLists;
	}

	public static void main(String[] args) {
		String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(strings);
	}
}
