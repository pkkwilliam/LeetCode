public class Factorial{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[] input = {0,1,2,3,5,6,7,8,9,10};
        for(int i : input)
            System.out.println(solution.factorial(i));
    }
}
class Solution{
    public int factorial(int n){
        if(n < 2)
            return n;
        else
            return n * factorial(n - 1);
    }
}