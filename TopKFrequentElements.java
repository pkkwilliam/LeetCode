// Problem 347
// Top K Frequent Elements

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentElements{
    public static void main(String[]args){
        Solution solution = new Solution();
        int input1 [][] = {
            {1,1,1,2,2,3}
            
        };
        int input2 [] = {2};
        for(int i = 0; i < input1.length; i++)
            System.out.println(solution.topKFrequent(input1[i],input2[i]));
    }
}
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++)
        	if(map.containsKey(nums[i]))
        		map.put(nums[i], map.get(nums[i])+ 1);
        	else
        		map.put(nums[i], 1);

        for(int i = 0; i < k; i++){
        	int localMax = Integer.MIN_VALUE;
        	int removeKey = 0;
        	Object [] keys = map.keySet().toArray();
        	for(int j = 0 ; j < map.size(); j++){
        		if(map.get(keys[j]) > localMax){
        			localMax = map.get(keys[j]);
        			removeKey = (int)keys[j];
        		}
        	}
    		result.add(removeKey);
    		map.remove(removeKey);
        }
        return result;   
    }
}