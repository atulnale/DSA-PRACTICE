package problem28;

public class Approach1 {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++){
            boolean result = compare(haystack, needle,i);
            if(result) return i;
        }
        return -1;
    }
    public boolean compare(String s1, String s2, int start){
        int i = 0;
        while(i != s2.length()){
            if(start >= s1.length() || i >= s2.length()) return false;
            if(s1.charAt(start) !=  s2.charAt(i)){
                return false;
            }
            i++;
            start++;
        }
        return true;
    }
}


