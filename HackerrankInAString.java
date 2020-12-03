/*package com.deepankarPrac;

import java.util.HashSet;
import java.util.Set;

public class HackerrankInAString {
	

	private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
	public static void main(String[] args) {
		String str = "hereiamstackerrank";
		String res = hackerrankInString(str);
		System.out.println(res);
		

	}

}
*/