// Problem 290
// Word Pattern

import java.util.Map;
import java.util.HashMap;

public class WordPattern{
	public static void main(String[]args){
		Solution solution = new Solution();
        String pattern[] = {
        	"abba",
        	"abba",
        	"aaaa",
        	"abba",
        	"aaa"
        };
        String str [] = {
        	"dog cat cat dog",
        	"dog cat cat fish",
        	"dog cat cat dog",
        	"dog dog dog dog",
        	"aa aa aa aa"
        };
        for(int i = 0; i < pattern.length; i++)
        	System.out.println(solution.wordPattern(pattern[i], str[i]));
	}
}
class Solution {
    public boolean wordPattern(String pattern, String str) {
    	Map<Character, String> map = new HashMap<Character, String>();
        String[] strArray = str.split(" ");
        if(pattern.length() != strArray.length)
        	return false;
        
        for(int i = 0; i < strArray.length; i++){
        	if(map.containsKey(pattern.charAt(i))){
        		if(!map.get(pattern.charAt(i)).equals(strArray[i]))
        			return false;
        	}else
        		if(map.containsValue(strArray[i]))
        			return false;
        		map.put(pattern.charAt(i), strArray[i]);
        }
        return true;
    }
}