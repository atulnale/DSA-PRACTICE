package problem44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    Map<String, Boolean> map = new HashMap<>();
    public boolean isMatch(String s, String p) {
        return helper(s, p, 0 , 0);
    }

    private boolean helper(String s, String p, int si, int pi) {
        if(map.containsKey(si+":"+pi)) return map.get(si+":"+pi);
        if(si >= s.length() && (pi >= p.length())) {
            map.put(si+":"+pi,true);
            return true;
        }
        if(pi >= p.length() && si < s.length()) {
            map.put(si+":"+pi,false);
            return false;
        }
        if(si >= s.length() && p.charAt(pi) != '*') {
            map.put(si+":"+pi,false);
            return false;
        }
        if(si >= s.length() && p.charAt(pi) == '*') {
            boolean result = helper(s,p, si, pi+1);
            map.put(si+":"+pi,result);
            return result;
        }
        if(p.charAt(pi) == '?') {
            boolean result =  helper(s,p, si+1, pi+1);
            map.put(si+":"+pi,result);
            return result;
        }
        if(p.charAt(pi) == '*') {
            boolean result =  helper(s,p, si+1, pi+1) || helper(s,p, si+1, pi)|| helper(s,p, si, pi+1);
            map.put(si+":"+pi,result);
            return result;
        }
        if(p.charAt(pi) == s.charAt(si)) {
            boolean result =  helper(s,p, si+1, pi+1);
            map.put(si+":"+pi,result);
            return result;
        }
        map.put(si+":"+pi,false);
        return false;
    }
}