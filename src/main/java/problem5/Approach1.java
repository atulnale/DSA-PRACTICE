package problem5;

import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    String result = "";
    Map<String,Boolean> map = new HashMap<>();
    public String longestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        helper(s,left, right);
        return result;
    }

    private boolean helper(String s, int left, int right) {
        if(map.containsKey(left+":"+right)){
            return map.get(left+":"+right);
        }
        if(left == right){
            if(result.length() < right - left + 1){
                result = s.substring(left,right +1);
            }
            map.put(left+":"+right,true);
            return true;
        }
        if(left > right) return true;
        if(s.charAt(left) == s.charAt(right)){
            boolean resp = helper(s, left+1, right -1);
            if(resp){
                map.put(left+":"+right,true);
                if(result.length() < right - left + 1 ){
                    result = s.substring(left,right +1);
                }
                return true;
            }

        }
        map.put((left+1)+":"+right,helper(s,left+1,right));
        map.put(left+":"+(right-1),helper(s,left,right-1));
        return false;

    }
}
