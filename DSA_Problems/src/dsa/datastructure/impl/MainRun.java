package dsa.datastructure.impl;

public class MainRun {

	public static void main(String args[]) {
		MyHashMap<String, String> hash = new MyHashMap<String, String>();
		
		hash.put("Swap", "Navya");
		//System.out.println(hash.get("Swap"));
		
		hash.put("Nav", "LOVE");
		System.out.println(hash.get("Nav"));
				
		System.out.println(hash.get("Swap"));
		System.out.println(hash.get("Nav"));
	}
	
}
