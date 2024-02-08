package problem10;


import java.util.HashMap;

public class Approach1 {
    HashMap<String,Boolean> map = new HashMap<>();

    public boolean isMatch(String s, String p) {
        if(p.isEmpty()) {
            return s.isEmpty();
        }
        boolean firstMatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0)=='.'));
        if(p.length()>=2 && p.charAt(1)=='*'){
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        }
        return firstMatch && isMatch(s.substring(1),p.substring(1));
    }
}
