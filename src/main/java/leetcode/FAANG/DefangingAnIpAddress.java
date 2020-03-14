package leetcode.FAANG;

public class DefangingAnIpAddress {

	public static String defangIPaddr(String address) {
		if (!address.contains(".")) {
			return "";
		}
		return address.replaceAll("\\.","[.]");
	}

	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
		System.out.println(defangIPaddr("255.100.50.0"));
	}
}
