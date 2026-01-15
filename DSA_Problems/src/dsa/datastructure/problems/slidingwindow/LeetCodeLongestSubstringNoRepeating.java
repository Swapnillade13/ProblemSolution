package dsa.datastructure.problems.slidingwindow;

import java.util.HashMap;

public class LeetCodeLongestSubstringNoRepeating {

	public int lengthOfLongestSubstring(String s) {
        
		int startWindow = 0;
		int maxLen = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int endWindow = 0; endWindow < s.length(); endWindow++) {
			char endChar = s.charAt(endWindow);
			if(map.containsKey(endChar)) {
				startWindow = Math.max(startWindow, map.get(endChar) + 1);
			}
			map.put(endChar, endWindow);
			maxLen = Math.max(maxLen, endWindow - startWindow + 1);
		}
		
        return maxLen;

    }
	
	public static void main(String args[]) {
		LeetCodeLongestSubstringNoRepeating leet = new LeetCodeLongestSubstringNoRepeating();
		
		System.out.println(leet.lengthOfLongestSubstring("pwwkew"));
	}
	
}
