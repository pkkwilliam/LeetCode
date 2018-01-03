// Problem 334
// Increasing Triplet Subsequence
public class IncreasingTripletSubsequence{
    public static void main(String[]args){
        Solution solution = new Solution();
        int [][] testValue= {
            {1,2,3,4,5},
            {2,1,5,0,3},
            {5,1,5,5,2,5,4},
            {1,1,1,1,1,1,1,1},
            {0,4,2,1,0,-1,-3},
            {5,1,2},
            {1,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,3},
            {128,6,5,2,256,7,2,1,512},
            {1,2,-10,-8,-7},
            {128,6,5,2,256,7,2,1}
        };
        boolean testResult [] = {
            true,
            false,
            true,
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            false
        };
        Test test[] = new Test[testValue.length];
        for(int i = 0; i < test.length; i++)
            test[i] = new Test(testValue[i], testResult[i]);
        System.out.println(test[0].result);
        for(int i = 0; i < test.length; i++){
            boolean result = solution.increasingTriplet(test[i].nums);
            System.out.print(i+1+" result = "+result+" expected = "+test[i].result);
            System.out.println((result != test[i].result)?" CHECK!":"");
        }
    }
}
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= small1){
                    small1 = nums[i];
                }else if(nums[i] < small2)
                    small2 = nums[i];
                else{
                    //System.out.println(small1+" "+small2+" "+nums[i]);
                    return true;
                }
        }
        return false;
    }
}
class Test{
    boolean result;
    int [] nums;
    public Test(int [] nums, boolean result){
        this.result = result;
        this.nums = nums;
    }
}