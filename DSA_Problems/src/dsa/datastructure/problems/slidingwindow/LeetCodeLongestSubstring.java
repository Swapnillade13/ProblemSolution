package dsa.datastructure.problems.slidingwindow;

import java.util.HashMap;

public class LeetCodeLongestSubstring {

	public int lengthOfLongestSubstringTwoDistinct(String s) {
		int maxLen = 0;
		int startWindow = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int endWindow = 0; endWindow < s.length(); endWindow++) {
			char endChar = s.charAt(endWindow);
			map.put(endChar, map.getOrDefault(endChar, 0) + 1);
			
			while(map.size() > 2) {
				char startChar = s.charAt(startWindow);
				map.put(startChar, map.get(startChar) -1);
				if(map.get(startChar) == 0) {
					map.remove(startChar);
				}
				startWindow++;
			}
			
			maxLen = Math.max(maxLen, endWindow - startWindow + 1);
			
		}
		
		return maxLen;
	}
	
	public static void main(String args[]) {
		LeetCodeLongestSubstring sub = new LeetCodeLongestSubstring();
		System.out.println(sub.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
	}
	
}
