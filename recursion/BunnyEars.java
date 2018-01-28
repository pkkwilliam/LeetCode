public class BunnyEars{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[] input = {0,1,2,3,5,6,7,8,9,10};
        for(int i : input)
            System.out.println(solution.bunnyEars(i));
    }
}
class Solution{
    public int bunnyEars(int bunnies) {
        if(bunnies == 0)
            return 0;
        else
            return 2 + bunnyEars(bunnies - 1);
    }
}