package problem17;

import java.util.*;

public class Approach1 {
    List<String> result = new ArrayList<>();
    static Map<Integer,String> map = new HashMap<>();
    static {

        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        helper(digits,"");
        return result;

    }
    public void helper(String digits, String currStr){
        if(digits.length() == 0) {
            if(currStr.length() > 0){
                result.add(currStr) ;
            }
            return;
        }
        int digit = Integer.valueOf(digits.substring(0,1));
        for(Character ch : map.get(digit).toCharArray()){
            helper(digits.substring(1),currStr+ch);
        }
    }

}


