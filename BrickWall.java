// Problem 554
// Brick Wall

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class BrickWall{
    public static void main(String[]args){
        Solution solution = new Solution();
        int input1 [][] = 
        		{
        		 {1,2,2,1},
        		 {3,1,2},
        		 {1,3,2},
        		 {2,4},
        		 {3,1,2},
        		 {1,3,1,1}
        		 
        		};
        int input2 [][] = {
        		{1},
        		{1},
        		{1}
        };
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i < input2.length; i++){
        	list.add(new ArrayList<Integer>());
        	for(int j = 0; j < input2[i].length; j++)
        		list.get(i).add(input2[i][j]);
        }
        System.out.println(solution.leastBricks(list));
        
    }
}
class Solution {
    public int leastBricks(List<List<Integer>> wall) {
    	if(wall == null)
    		return 0;
    	Map <Integer, Integer> map = new HashMap <Integer, Integer>();
    	
    	for(int i = 0; i < wall.size(); i++){
    		int sum = 0;
    		for(int j = 0; j < wall.get(i).size() - 1; j++){
    			sum += wall.get(i).get(j);
    			if(map.containsKey(sum))
    				map.put(sum, map.get(sum)+1);
    			else
    				map.put(sum, 1);
    		}
    	}
    	int result = 0;
    	for(int i : map.keySet())
    			if(map.get(i) > result)
    				result = map.get(i);
    	return wall.size() - result;
    }
}