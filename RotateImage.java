// Problem 48
// Rotate Image

public class RotateImage{
    public static void main(String[]args){
        Solution solution = new Solution();
        int input0 [][] = {
        	{1}
        };
        int input1 [][] = {
        	{1,2},
        	{3,4}
        };
        int input2 [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int input3 [][] = {
        	{1,2,3,4},
        	{5,6,7,8},
        	{9,10,11,12},
        	{13,14,15,16}
        };
        int input4 [][] = {
        	{1,2,3,4,5},
        	{6,7,8,9,10},
        	{11,12,13,14,15},
        	{16,17,18,19,20},
        	{21,22,23,24,25}
        };
        
        int input5 [][] = {
        	{1,2,3,4,5,6},
        	{7,8,9,10,11,12},
        	{13,14,15,16,17,18},
        	{19,20,21,22,23,24},
        	{25,26,27,28,29,30},
        	{31,32,33,34,35,36}
        }; 
        int grandInput [][][] = {
        		input0,input1,input2,input3,input4,input5
        };
        for(int[][] i : grandInput)
        	solution.rotate(i);
    }
}
class Solution {
    public void rotate(int[][] matrix) {
    	int layer = 0;
    	do{
    		int count = 0, length = matrix.length - 1 - layer;
            while(count < matrix.length - 1 - layer * 2){
            	int num1 = matrix[layer][count + layer];
            	int num2 = matrix[count + layer][length];
            	int num3 = matrix[length][length - count];
            	int num4 = matrix[length - count][layer];
            	
            	matrix[layer][count + layer] = num4;
            	matrix[count + layer][length] = num1;
            	matrix[length][length - count] = num2;
            	matrix[length - count][layer] = num3;
            	count++;
            }
            layer++;
    	}while(layer < matrix.length - 2);
    }
}