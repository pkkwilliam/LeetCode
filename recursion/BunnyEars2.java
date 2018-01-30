/*

We have bunnies standing in a line, numbered 1, 2, ... 
The odd bunnies (1, 3, ..) have the normal 2 ears. 
The even bunnies (2, 4, ..) we'll say have 3 ears, 
because they each have a raised foot. 
Recursively return the number of "ears" in the bunny line 1, 2, ... n 
(without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
*/

public class BunnyEars2{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[] input = {0,1,2,3};
        for(int i : input)
            System.out.println(solution.bunnyEars2(i));
    }
}
class Solution{
    public int bunnyEars2(int bunnies) {
        if(bunnies == 0)
            return 0;
        else
            return ((bunnies % 2 == 1) ? 2 : 3) + bunnyEars2(bunnies - 1);
    }
}