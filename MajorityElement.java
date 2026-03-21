package neetcode250;

public class MajorityElement {

	    public int majorityElement(int[] nums) {
	        HashMap<Integer,Integer> num = new HashMap<>();
	        int res=0,max=0;
	        for(int i=0;i<nums.length;i++){
	            num.put(nums[i],num.getOrDefault(nums[i],0)+1);
	            if(num.get(nums[i])>max){
	                res=nums[i];
	                max=num.get(nums[i]);
	            }
	        }
	     return res;
	    }
	
}
