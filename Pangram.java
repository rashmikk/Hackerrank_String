import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String str = new String();
		str = stdin.nextLine();
		String result = checkPangram((str.replaceAll(" ", "")).toLowerCase());
		System.out.println(result);
	}

	public static String checkPangram(String s1) {
		int charArr[] = new int[26];
		String output = "pangram";
		for (int i = 0; i < s1.length(); i++)
			charArr[s1.charAt(i) - 97]++;
		for (int i = 0; i < 26; i++){
			if (charArr[i]==0){
				output = "not pangram";
				break;
			}
		}
		return output;
	}
}
