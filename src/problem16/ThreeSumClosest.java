package problem16;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[]args){
        int[][] input = {
                {-1, 2, 1, -4},
                {-5,-10, 2, 5, 99},
                {-5, -9, 31, 66, 132, 2},
                {1,1,-1,-1,3},
                {-3,-2,-5,3,-4},
                {1,2,4,8,16,32,64,128}

        };
        int[] target = {
                1, 130, 28, -1, -1, 82
        };
        for(int i = 0; i < input.length; i++)
            System.out.println(new Solution().threeSumClosest(input[i], target[i]));
    }
}
class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int result = num[0] + num[1] + num[2];
        for(int i = 0; i < num.length - 2; i++){
            int left = i + 1, right = num.length - 1;
            while(left < right){
                int sum = num[i] + num[left] + num[right];
                if(sum == target)
                    return sum;
                if(Math.abs(sum - target) < Math.abs(result - target))
                    result = sum;
                if(sum < target)
                    left++;
                else if(sum > target)
                    right--;
            }
        }
        return result;
    }
}