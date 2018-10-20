package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
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