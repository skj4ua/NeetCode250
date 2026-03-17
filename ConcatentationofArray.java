package neetcode250;

public class ConcatentationofArray {

	
	    public static int[] getConcatenation(int[] nums) {
	        int length = nums.length;
	        int ans[] = new int[length*2];

	        for(int i=0;i<length*2;i++)
	            ans[i]=nums[i%length];
	    
	    return ans;
	    }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,4,1,2};
		getConcatenation(num);
	}

}
