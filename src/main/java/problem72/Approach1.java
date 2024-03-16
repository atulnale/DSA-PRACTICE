package problem72;

public class Approach1 {
    public boolean isPalindrome(String s){
        return helper(s.toLowerCase());
    }
    public boolean helper(String s) {
        if(s.length() == 1 || s.isEmpty()) return true;
        if(!Character.isAlphabetic(s.charAt(0)) && !Character.isDigit(s.charAt(0))) return helper(s.substring(1));
        if(!Character.isAlphabetic(s.charAt(s.length()-1)) && !Character.isDigit(s.charAt(s.length()-1))) return helper(s.substring(0,s.length()-1));
        if(s.charAt(0)== s.charAt(s.length()-1)) return helper(s.substring(1, s.length()-1));
        return false;
    }
}