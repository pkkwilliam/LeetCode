// Problem 475
// Heaters

import java.util.Arrays;

public class Heaters{
	public static void main(String[]args){
		Solution solution = new Solution();		
		int [] crazy = new int [15226];
		for(int i = 0; i < 15225; i++)
			crazy[i] = i;
		crazy[15225] = 1522;
		
		int houses [][] = {
			{1,2,3,4,5,6,7,8,9},
			{1,1,1,1,1,1,999,999,999,999,999},
			{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923},
			{1,2,3,4,5,6,7,8,9,10},
			crazy
		};
		int heater [][] = {
			{2,3,4,5,6,7,8,9,10},
			{499,500,501},
			{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612},
			{1,2,3,4,5,6,7,8,9,10},
			crazy
		};
		for(int i = 0; i < houses.length; i++){
			System.out.println(solution.findRadius(houses[i], heater[i]));  
		}
    }
}

class Solution {
    public int findRadius(int[] houses, int[] heaters){
    	Arrays.sort(houses);
    	Arrays.sort(heaters);
    	
    	int currentHeater = 0, result = 0;
    	for(int i = 0; i < houses.length; i++){
    		int localDistance, nextDistance;
    		do{
    			localDistance = Math.abs(houses[i] - heaters[currentHeater]);
    			nextDistance = (currentHeater + 1 < heaters.length) ? Math.abs(houses[i] - heaters[currentHeater + 1]) : localDistance;
    			currentHeater++;
    		}while(localDistance >= nextDistance && currentHeater < heaters.length);
    		currentHeater--;
    		if(localDistance > result)
    			result = localDistance;
    	}
    	return result;
    }
}