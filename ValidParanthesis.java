package neetcode250;

import java.util.Stack;

public class ValidParanthesis {
	    public boolean isValid(String s) {
	        Stack<Character> st = new Stack<>();
	        if(s.length()<2)return false;
	        int j=0;
	        for(int i=0;i<s.length();i++){
	           
	           if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
	                st.push(s.charAt(i)); j++;
	           }
	           else if(s.charAt(i)==')'){
	            j--;
	                if( st.size()>0 && st.peek()=='('){
	                        st.pop();
	                }
	           }   
	            else if(s.charAt(i)==']'){
	                j--;
	                if( st.size()>0 && st.peek()=='['){
	                    st.pop(); 
	                }
	            }
	            else if(s.charAt(i)=='}'){
	                j--;
	                if( st.size()>0 && st.peek()=='{'){
	                    st.pop();
	            }}
	        }

	        if(st.size()==0 && j==0)return true;
	    return false;
	    }	
}
