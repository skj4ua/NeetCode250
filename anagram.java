package neetcode250;

import java.util.Hashtable;

public class anagram {
	
	    public static boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length())
	        return false;

	        Hashtable<Character,Integer> map = new Hashtable<>();
	        

	        for(int i=0;i<s.length();i++){
	            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
	        }
	        
	    
	    for(int val:map.values()){
	        if(val!=0)return false;
	    }

	    return true;
	}
	    
	    public static void main(String args[]) {
	    System.out.println("IsANagram: "+ isAnagram("carrace","racecar"));	
	    }

}
