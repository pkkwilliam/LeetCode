package leetcode;

public class Candy {
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