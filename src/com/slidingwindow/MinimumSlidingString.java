package com.slidingwindow;
import java.util.*;
public class MinimumSlidingString {

	public static void main(String[] args) {
		String s="abcdef";
		String p="bnh";
		smallestWindow( s,p);

	}
	 public static String smallestWindow(String s, String p)
	    {
	        // Your code here
	         int startindex = -1;
	        char[] str = s.toCharArray();
	        char[] ptr = p.toCharArray();
	        int minlength = Integer.MAX_VALUE;
	        int count = 0;
	        int l = 0;
	        int r = 0;
	        int m = ptr.length;
	        int n = str.length;

	        if (n < m) return "-1"; // If string is shorter than the pattern

	        int[] hash = new int[256]; // Pattern frequency array
	        int[] windowHash = new int[256]; // Sliding window frequency array

	        // Populate hash with the frequency of characters in the pattern
	        for (int i = 0; i < m; i++) {
	            hash[ptr[i]]++;
	        }

	        while (r < n) {
	            // Expand window by adding character at r to the window
	            windowHash[str[r]]++;

	            // Check if this character is relevant and contributes to the count
	            if (hash[str[r]] > 0 && windowHash[str[r]] <= hash[str[r]]) {
	                count++;
	            }

	            // When we have all the characters in the window, try to shrink it
	            while (count == m) {
	                // Update minimum length and starting index if we find a smaller window
	                if (r - l + 1 < minlength) {
	                    minlength = r - l + 1;
	                    startindex = l;
	                }

	                // Shrink the window from the left
	                windowHash[str[l]]--;

	                // If removing the left character breaks the validity of the window
	                if (hash[str[l]] > 0 && windowHash[str[l]] < hash[str[l]]) {
	                    count--;
	                }

	                l++; // Move the left pointer to the right
	            }

	            r++; // Move the right pointer to expand the window
	        }

	        // If startindex was never updated, return empty string
	        return startindex == -1 ? "-1" : s.substring(startindex, startindex + minlength);
	    }

}
