// Problem 205
// Isomorphic Strings

public class IsomorphicStrings{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input1 = {
            "egg","foo","paper","aba"
        };
        String[] input2 ={
            "add","bar","title","baa"
        };
        for(int i = 0; i < input1.length; i++)
            System.out.println(solution.isIsomorphic(input1[i],input2[i]));
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
        	char char1 = s.charAt(i), char2 = t.charAt(i);
            if(map1.containsKey(char1) && map2.containsKey(char2)){
            	int post1 = map1.get(char1), post2 = map2.get(char2);
            	if(post1 != post2)
            		return false;
            	else{
            		map1.put(char1, i);
            		map2.put(char2, i);
            	}
            }else if(!map1.containsKey(char1) && !map2.containsKey(char2)){
            	map1.put(char1, i);
            	map2.put(char2, i);
            }else
            	return false;
        }
        return true;
    }
}