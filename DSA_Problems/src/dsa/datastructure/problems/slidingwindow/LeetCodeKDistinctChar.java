package dsa.datastructure.problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeKDistinctChar {

	public int longestSubstringWithKdistinct(String s, int k) {
		int windowStart = 0;
		int maxLen = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			char endChar = s.charAt(windowEnd);
			map.put(endChar, map.getOrDefault(endChar, 0) + 1);
			while(map.size() > k) {
				char startChar = s.charAt(windowStart);
				map.put(startChar, map.get(startChar) - 1);
				if(map.get(startChar) == 0) {
					map.remove(startChar);
				}
			}
			
			maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
		}
		
		return maxLen;
	}

	public static void main(String args[]) {
		LeetCodeKDistinctChar leet = new LeetCodeKDistinctChar();
		System.out.println(leet.longestSubstringWithKdistinct("araaci", 2));
	}
}
