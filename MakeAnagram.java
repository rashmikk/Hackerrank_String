/*
 * https://www.hackerrank.com/challenges/make-it-anagram
 */
package test;

import java.util.Scanner;

public class AnagramDeletion {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String str1 = new String();
		String str2 = new String();
		str1 = stdin.nextLine();
		str2 = stdin.nextLine();
		int result = countDeleteAnagram(str1, str2);
		System.out.println(result);
	}

	public static int countDeleteAnagram(String s1, String s2) {
		int charArr1[] = new int[26];
		int charArr2[] = new int[26];
		for (int i = 0; i < s1.length(); i++)
			charArr1[s1.charAt(i) - 97]++;
		for (int i = 0; i < s2.length(); i++)
			charArr2[s2.charAt(i) - 97]++;
		int count = 0;
		for (int i = 0; i < 26; i++)
			count += Math.abs(charArr1[i] - charArr2[i]);
		return count;
	}
}
