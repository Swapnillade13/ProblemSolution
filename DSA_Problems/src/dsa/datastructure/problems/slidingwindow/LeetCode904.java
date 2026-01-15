package dsa.datastructure.problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LeetCode904 {

	public int totalFruit(int[] fruits) {
        //given k = 2 as basket
        int windowStart = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
        	int endFruit = fruits[windowEnd];
        	map.put(endFruit, map.getOrDefault(endFruit, 0) + 1);
        	
        	while(map.size() > 2) {
        		int startFruit = fruits[windowStart];
        		map.put(startFruit, map.get(startFruit) - 1);
        		if(map.get(startFruit) == 0) {
        			map.remove(startFruit);
        		}
        		windowStart++;
        	}
        	maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
        }
        return maxLen;
    }
	
	public static void main(String args[]) {
		LeetCode904 leet = new LeetCode904();
		int input[] = {0,1,2,2};
		System.out.println(leet.totalFruit(input));
	}
	
}
