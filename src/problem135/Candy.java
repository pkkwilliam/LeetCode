package problem135;

public class Candy {
    public static void main(String[]args){
        int[][] input = {
                {1,0,2},
                {2,2,2},
                {1,2,2},
                {1},
                {5,1,5,1}
        };
        for(int[] i : input)
            System.out.println(new Solution().Candy(i));
    }
}
class Solution{
    public int Candy(int[] input){
        int result = 1;
        for(int i = 1; i < input.length; i++) {
            int current = input[i], previous = input[i - 1];
            if(current > previous)
                result++;
            else if(previous > current)
                result++;
            result++;
        }
        return result;
    }
}