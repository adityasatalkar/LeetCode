package leetcode.FAANG;

import java.util.*;

public class TaskScheduler {

	public static HashMap<Character, List> populateHashMap(char[] tasks) {
		HashMap<Character, List> hashMap = new HashMap<>();
		for (int i = 0; i < tasks.length; i++) {
			char current = tasks[i];
			if (hashMap.containsKey(current)) {
				List<Integer> list = hashMap.get(current);
				list.add(1);
				hashMap.put(current,list);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(1);
				hashMap.put(current,list);
			}
		}
		return hashMap;
	}

	public static int leastInterval(char[] tasks, int n) {
		int result = 0;
		HashMap<Character, List> hashMap = populateHashMap(tasks);
		Character[] keysCharArray = hashMap.keySet().toArray(new Character[hashMap.size()]);
		Arrays.sort(keysCharArray);
		boolean noTaskLeft = true;
		while (noTaskLeft) {
			if(n == 0) {
				for (int i = 0; i < keysCharArray.length; i++) {
					char current = keysCharArray[i];
					if (hashMap.containsKey(current)) {
						List<Integer> list = hashMap.get(current);
						list.remove(0);
						if (list.size()>0) {
							hashMap.put(current,list);
						}
						else {
							hashMap.remove(current);
						}
						result++;
						System.out.print(" " + current + " ");
					}
					if (hashMap.size() == 0) {
						noTaskLeft = false;
					}
				}
			}
			else {
				for (int j = 0; j < n; j++) {
					for (int i = 0; i < keysCharArray.length; i++) {
						char current = keysCharArray[i];
						if (hashMap.containsKey(current)) {
							List<Integer> list = hashMap.get(current);
							list.remove(0);
							if (list.size()>0) {
								hashMap.put(current,list);
							}
							else {
								hashMap.remove(current);
							}
							result++;
							System.out.print(" " + current + " ");
						}
						if (hashMap.size() == 0) {
							noTaskLeft = false;
						}
					}
					System.out.print(" Idle ");
				}
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		char[] tasks1 = {'A','A','A','B','B','B'};
		int n1 = 2;
		int n2 = 0;
		int n3 = 50;
		char[] tasks2 = {'A','A','A','A','B','B','C','C','D','D'};
		System.out.println(leastInterval(tasks1,n1));
		System.out.println(leastInterval(tasks1,n2));
		System.out.println(leastInterval(tasks1,n3));

		System.out.println(leastInterval(tasks2,n1));
	}
}



/*

	//Queue<Character> queue = populateQueue(hashMap);

	public static Queue<Character> populateQueue(HashMap<Character, List> hashMap) {
		Character[] keysCharArray = hashMap.keySet().toArray(new Character[hashMap.size()]);
		Queue<Character> queue = (Queue<Character>) new ArrayList<Character>();
		for (int i = 0; i < keysCharArray.length; i++) {
			queue.add(keysCharArray[i]);
		}
		return queue;
	}

 */