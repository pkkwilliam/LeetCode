// Problem 16
// 3SumClosest

public class ThreeSumClosest{
    public static void main(String[]args){
        Solution solution = new Solution();
        int input [][] = {
            {-1,2,1,-4}, // 2
            {99,-5,1,7,9}, // 101
            {1,1,-1,-1,3}, // -1
            {0,1,2} // 3
        };
        int target [] = {1,100,-1, 0};
        for(int i = 0; i < input.length; i++)
        	System.out.println(solution.threeSumClosest(input[i], target[i]));
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	int result = (target >= 0)? Integer.MAX_VALUE : Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                	int currentSum = nums[i]+nums[j]+nums[k];
                	//System.out.println("i = "+i+" j = "+j+" k = "+k+" Sum = "+currentSum+" Result = "+result);
                    if(Math.abs(target - currentSum) < Math.abs(result - target))
                        result = currentSum;
                }
            } 
        }
        return result;
    }
}