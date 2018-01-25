//Problem1
// Two Sum

public class TwoSum{
	public static void main(String[]args){
        Solution solution = new Solution();
        int [] nums = {2,7,11,15};
        int target = 22;
        int [] result = solution.twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] array = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            array[i][0] = nums[i];
            array[i][1] = i;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0])
                    return 1;
                else
                    return -1;

            }
        });
        int left = 0, right = array.length -1;
        while(left < right){
            int sum = array[left][0] + array[right][0];
            if(sum == target)
                break;
            else if(sum > target)
                right--;
            else if(sum < target)
                left++;
        }
        return new int[] {array[left][1],array[right][1]};
    }

}