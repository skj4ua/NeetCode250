package neetcode250;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
	    public static boolean hasDuplicate(int[] nums) {
	        Set<Integer> check = new HashSet<>();

	        for(int n:nums){
	            if(check.contains(n)){
	                return true;
	            }
	            else{check.add(n);}
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
	    	int[] nums = {1,2,2,3};//test case for duplicate
	    	System.out.print(hasDuplicate(nums));
	    }
	
}
