package problem22;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        helper(n,0,"");
        return result;
    }

    private void helper(int n,int open, String s) {
        if(n == 0) {
            while(open != 0){
                s = s+')';
                --open;
            }
            result.add(s);
            return;
        }
        helper(n-1,open + 1, s+'(');
        if(open != 0){
            helper(n, open-1, s+')');
        }


    }
}


