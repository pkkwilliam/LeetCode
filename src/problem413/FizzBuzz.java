package problem413;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[]args){
        int[] input = {15,0};
        for(int i : input)
            for(String s : new Solution().fizzBuzz(i))
                System.out.println(s);
    }
}
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0)
                list.add("FizzBuzz");
            else if(i % 3 == 0)
                list.add("Fizz");
            else if(i % 5 == 0)
                list.add("Buzz");
            else
                list.add(i+"");
        }
        return list;
    }
}