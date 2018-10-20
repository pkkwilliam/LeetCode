package leetcode;

/*
Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000.
 */

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        for(int i = 0; i < A.length(); i++){
            int result = recursion_helper(A,B,i,0);
            if(result > -1)
                return result + 1;
        }
        return -1;
    }
    private int recursion_helper(String A, String B, int current_a, int current_b){
        if(current_b == B.length())
            return 0;
        char a = A.charAt(current_a), b = B.charAt(current_b);
        if(a != b)
            return Integer.MIN_VALUE;
        if(current_a + 1 == A.length() && current_b + 1 != B.length()) {
           return 1 + recursion_helper(A,B,0,current_b+1);
        }else
            return recursion_helper(A,B,current_a+1,current_b+1);
    }
}