package leetcode.practice;

import java.util.HashMap;

public class UniqueEmailAddresses {

	static boolean checkIfEmailContainsPlusSign(String emailAddressLocalName) {
		return emailAddressLocalName.contains("+");
	}

	static String getLocalName(String emailAddress) {
		String localName = "";
		if (checkIfEmailContainsPlusSign(emailAddress)) {
			String[] splitEmail = emailAddress.split("\\+",2);
			localName = splitEmail[0].replaceAll("\\.","");
		} else {
			String[] splitEmail = emailAddress.split("@",2);
			localName = splitEmail[0].replaceAll("\\.","");
		}

		return localName;
	}

	static String getDomainName(String emailAddress) {
		String[] emailAddressSplitArray = emailAddress.split("@",2);
		return emailAddressSplitArray[1];
	}

	static int numUniqueEmails(String[] emails) {

		HashMap<String,Integer> hashMap = new HashMap<>();

		int countUnique = 0;

		for (String emailAddress: emails) {
			String localName = getLocalName(emailAddress);
			String domainName = getDomainName(emailAddress);
			hashMap.putIfAbsent(localName+"@"+domainName,1);
		}
		return hashMap.size();
	}

	public static void main(String[] args) {
 		String[] emailAddressArray = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emailAddressArray));
	}
}
