package dsa.datastructure.problems.stacks;

import java.util.HashMap;
import java.util.Map;

public class DuplicateRemove {
	
	 public static String removeConsecutiveDuplicates(String s) {
	        
		 String ans = "";
	        
	        HashMap<Character, Integer> map = new HashMap<>();
	        int n = s.length();
	        
	        for(int i = 0; i < n; i++) {
	            char ch = s.charAt(i);
	            map.put(ch, map.getOrDefault(ch, 0)+1);
	        }
	        
	        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
	           ans.concat(entry.getKey().toString());
	        }
	        
	        return ans;
	        
	        
	 }
	
	 public static void main(String args[]) {
		 String s = "aaaaaabaabccccccc";
		 System.out.println(removeConsecutiveDuplicates(s));
	 }
}

