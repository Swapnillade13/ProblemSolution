package dsa.datastructure.problems.slidingwindow;

import java.util.HashMap;

public class LeetCodeLongestSubstringKRepeating {

	public int lengthOfLongestSubstring(String s, int k) {
        
		int startWindow = 0;
		int maxLen = 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int endWindow = 0; endWindow < s.length(); endWindow++) {
			char endChar = s.charAt(endWindow);
			if(map.containsKey(endChar)) {
				if(map.get(endChar) > k) {
					startWindow = Math.max(startWindow, map.get(endChar) + 1);
				}
				startWindow++;
			}
			map.put(endChar, map.getOrDefault(endChar, 0)+1);
			maxLen = Math.max(maxLen, endWindow - startWindow + 1);
		}
		
        return maxLen;

    }
	
	public static void main(String args[]) {
		LeetCodeLongestSubstringKRepeating leet = new LeetCodeLongestSubstringKRepeating();
		
		System.out.println(leet.lengthOfLongestSubstring("ababbc", 2));
	}
	
}
