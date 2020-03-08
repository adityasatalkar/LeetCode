package leetcode;

public class HelperMethods {

	public static String getStringRepresentationOfInputArrayForJava(String array) {
		String result = "";
		for (int i = 0; i < array.length(); i++) {

			if (array.charAt(i) == '[') {
				result += "{";
			}
			else if (array.charAt(i) == ']') {
				result += "}";
			}
			else {
				result += array.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String array = "[[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]";
		System.out.println(getStringRepresentationOfInputArrayForJava(array));
	}
}
