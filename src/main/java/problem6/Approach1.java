package problem6;

public class Approach1 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder str = new StringBuilder();
        int l = 0;
        int next = numRows -1 + numRows - 1;
        for(int i = 0 ; i<numRows && i<s.length(); i++){
            int j = i;
            while(true){
                if(j == i){
                    str.append(s.charAt(i));
                    j = j+next;
                    continue;
                }
                if(l != 0 && l < next  && j-l < s.length()) {
                    str.append(s.charAt(j-l));
                }
                if(j>=s.length()){
                    break;
                }
                str.append(s.charAt(j));
                j = j+next;
            }l=l+2;
        }
        return str.toString();
    }
}
