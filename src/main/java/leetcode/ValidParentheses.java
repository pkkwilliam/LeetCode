package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');
        System.out.println(stack);
        for(int i = 0; i < s.length(); i++){
            if(pair.containsValue(s.charAt(i)))
                stack.add(s.charAt(i));
            else if(stack.isEmpty() || pair.get(s.charAt(i)) != stack.pop())
                    return false;
        }
        return stack.isEmpty() ? true : false;
    }
}