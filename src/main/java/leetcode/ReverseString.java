package leetcode;

public class ReverseString {
    public String reverseString(String s) {
        if(s.length() < 1)
            return s;
        char[] array = s.toCharArray();
        char[] result = new char[array.length];
        int left = 0, right = array.length - 1;
        result[result.length/2] = (result.length % 2 == 1) ? array[array.length/2] : 'A';
        while(left < right){
            result[array.length - left - 1] = array[left++];
            result[array.length - right - 1] = array[right--];
        }
        return new String(result);
    }
}