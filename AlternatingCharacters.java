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
		for (int i = 1; i <= nooftestcases; i++) {
			String test = in.next();
			int count = 0;
			for (int j = 0; j < test.length() - 1; j++) {
				if (test.charAt(j) == test.charAt(j + 1))
					count++;
			}
			sb.append(count + "\n");
		}
		System.out.println(sb.toString());
    }
}
