// https://leetcode.com/problems/defanging-an-ip-address/
package com.adityasatalkar.leetcode;

public class DefangingAnIpAddress {

	public static void main(String[] args) {
		String address = "192.168.0.1";
		String outputDefangedAddress = "";

		String[] stringArray = address.split("\\.");

		for (int i = 0; i < stringArray.length; i++) {
			if (i == stringArray.length-1)
				outputDefangedAddress += stringArray[i];
			else
				outputDefangedAddress += stringArray[i] + "[.]";
		}

		System.out.println(outputDefangedAddress);
	}
}
