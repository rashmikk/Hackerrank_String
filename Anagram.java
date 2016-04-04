import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nooftestcases = in.nextInt();
		int result = -1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nooftestcases; i++) {
			String test = in.next();
			result = countChanges(test);
			sb.append(result + "\n");
		}
		System.out.println(sb.toString());
	}

	public static int countChanges(String input) {
		int output = -1;
		if (input.length() % 2 == 0) {
			int charArr1[] = new int[26];
			int charArr2[] = new int[26];
			int count = 0;
			for (int i = 0; i < input.length() / 2; i++)
				charArr1[input.charAt(i) - 97]++;
			for (int i = input.length() / 2; i < input.length(); i++)
				charArr2[input.charAt(i) - 97]++;

			for (int i = 0; i < 26; i++)
				count += Math.abs(charArr1[i] - charArr2[i]);
			return count / 2;
		}
		return output;
	}
}
