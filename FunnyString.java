import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
		Scanner in = new Scanner(System.in);
		int nooftestcases = in.nextInt();
		StringBuilder sb = new StringBuilder();
		String result = new String();
		for (int i = 1; i <= nooftestcases; i++) {
			String test = in.next(); // acxz
			result = "Funny";
			int diffStart = 0;
			int diffEnd = 0;
			int len = test.length();
			for (int k = 0; k < len - 1; k++) {
				diffStart = Math.abs(test.charAt(k) - test.charAt(k + 1));
				diffEnd = Math.abs(test.charAt(len - 1 - k) - test.charAt(len - k - 2));
				if (diffStart != diffEnd) {
					result = "Not Funny";
					break;
				}
			}
			sb.append(result + "\n");
		}
		System.out.println(sb.toString());
	
    }
}
