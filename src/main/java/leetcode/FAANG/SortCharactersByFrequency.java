package leetcode.FAANG;

import java.util.*;

public class SortCharactersByFrequency {

	public static HashMap<Character,Integer> populateHashMap(String s) {
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (hashMap.containsKey(current)) {
				int count = hashMap.get(current);
				count++;
				hashMap.put(current,count);
			}
			else {
				hashMap.put(current,1);
			}
		}
		return hashMap;
	}

	static Comparator<Map.Entry> comparator = new Comparator<Map.Entry>(){
		@Override
		public int compare(Map.Entry mapEntry1, Map.Entry mapEntry2){
			int x = (int)mapEntry1.getValue();
			int y = (int)mapEntry2.getValue();
			if(x > y) return 1;
			else if(x < y) return -1;
			else return 0;
		}
	};


	public static String frequencySort(String s) {
		HashMap<Character,Integer> hashMap = populateHashMap(s);

		List<Map.Entry> list = new ArrayList(hashMap.entrySet());
		Collections.sort(list, comparator);
		Collections.reverse(list);

		String result = new String();
		for (int i = 0; i < list.size(); i++) {
			for(int j = 0; j < (int)list.get(i).getValue(); j++){
				result += list.get(i).getKey();
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String[] sArray = {"tree", "cccaaa", "Aabb"};
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(frequencySort(sArray[i]));
		}
	}
}
