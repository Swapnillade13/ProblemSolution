package dsa.datastructure.problems.stacks;

import java.util.LinkedList;
import java.util.Stack;

public class BalanceParanthsis {

	public boolean isBalanced(String s) {
        
		int n = s.length();
        LinkedList<Character> st = new LinkedList<Character>();
        
        if(n % 2 != 0) return false;
        
        for(int i = 0; i < n; i++) {
            char str = s.charAt(i);
            
            if(str == '(' || str == '{' || str == '[') {
                st.push(str);
            } else {
            	char peek = st.peek();
                
                if(peek == '(' &&  str == ')') {
                    st.pop();
                }
                else if(peek == '{' &&  str == '}') {
                    st.pop();
                }
                else if(peek == '[' &&  str == ']') {
                    st.pop();
                } else {
                    return false;
                }
            }
            
        }
        
        if(st.isEmpty()) {
            return true;
        }
        
        return false;
        
        
    }
	
	public static void main(String[] args) {
		String input = "[{()}]";
		BalanceParanthsis bal = new BalanceParanthsis();
		System.out.println(bal.isBalanced(input));
	}

}
