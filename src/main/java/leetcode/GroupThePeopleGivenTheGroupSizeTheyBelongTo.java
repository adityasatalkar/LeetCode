// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {

		List<List<Integer>> result = new ArrayList<>();
		Map<Integer, List<Integer>> hashMap = new HashMap<>();

		for(int i = 0; i < groupSizes.length; i++)
		{
			int value = groupSizes[i];

			if(hashMap.containsKey(value)) {
				hashMap.get(value).add(i);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				hashMap.put(value, list);
			}
		}

		for(Map.Entry<Integer,List<Integer>> entry : hashMap.entrySet()) {

			int size = entry.getKey();

			if(entry.getValue().size() == size) {
				result.add(entry.getValue());
			} else {

				List<Integer> entryList = entry.getValue();
				List<Integer> partialResult = new ArrayList<>();

				for(int i = 0; i < entryList.size(); i++) {

					partialResult.add(entryList.get(i));

					if(( i + 1 ) % size == 0) {
						result.add(new ArrayList<Integer>(partialResult));
						partialResult.clear();
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] groupSizes = {3,3,3,3,3,1,3};
		List<List<Integer>> result = groupThePeople(groupSizes);
	}
}
