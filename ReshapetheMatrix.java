// Problem 566
// Reshape the Matrix

import java.util.List;
import java.util.ArrayList;

public class ReshapetheMatrix{
	public static void main(String[]args){
		Solution solution = new Solution();
		int input [][] = {
			{9,2},
			{2,4}
		};
		int r = 4;
		int c = 3;
		int result [][] = solution.matrixReshape(input,r,c);
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result[i].length; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	List<Integer> input = new ArrayList<Integer>();
    	for(int[] i: nums)
    		for(int j : i)
    			input.add(j);
    	
    	if(input.size() != (r*c))
    		return nums;

        int result [][] = new int[r][c];
        for(int i = 0; i < r; i++){
        	for(int j = 0; j < c; j++){
        		result[i][j] = input.get(i*c+j);
        	}
        }
        return result;
    }
