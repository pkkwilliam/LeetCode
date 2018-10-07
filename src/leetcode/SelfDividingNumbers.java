package leetcode;

/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.
*/

import java.util.List;
import java.util.ArrayList;

public class SelfDividingNumbers{
    public static void main(String[]args){
        int[] lefts = {1};
        int[] rights = {22};
        for(int i = 0; i < lefts.length; i++)
            for(int j : new Solution728().selfDividingNumbers(lefts[i],rights[i]))
                System.out.print(j+" ");

    }
}
class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        loop:
        for(int i = left; i <= right; i++){
            int currentInt = i;
            do{
                int module = currentInt % 10;
                if(module == 0)
                    continue loop;
                if(i % module != 0)
                    continue loop;
                currentInt /= 10;
            }while(currentInt > 0);
            list.add(i);
        }
        return list;
    }
}