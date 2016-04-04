/*
 * https://www.hackerrank.com/challenges/two-strings
 */
package test;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int count = Integer.parseInt(stdin.nextLine());
		StringBuilder sb = new StringBuilder();
		String str1 = new String();
		String str2 = new String();
		String result = new String();
		for (int i = 0; i < count; i++) {
			str1 = stdin.nextLine();
			str2 = stdin.nextLine();
			result = returnFlag(str1, str2);
			sb.append(result + "\n");
		}

		System.out.println(sb.toString());
	}

	public static String returnFlag(String s1, String s2) {
		String result = new String();

		int charArr1[] = new int[26];
		int charArr2[] = new int[26];

		for (int i = 0; i < s1.length(); i++)
			charArr1[s1.charAt(i) - 97]++;
		for (int i = 0; i < s2.length(); i++)
			charArr2[s2.charAt(i) - 97]++;
		for (int i = 0; i < 26; i++) {
			if (charArr1[i] >= 1 && charArr2[i] >= 1) {
				result = "YES";
				break;
			} else {
				result = "NO";
			}
		}

		return result;
	}

}
