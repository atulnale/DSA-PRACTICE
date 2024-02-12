package problem20;

import utils.ListNode;

import java.util.*;

public class Approach1 {
    public boolean isValid(String s) {
        Set<Character> open = new HashSet<>(new ArrayList<>(Arrays.asList('(','{','[')));
        Set<Character> closed = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> combination = new HashMap<>();
        combination.put(')','(');
        combination.put(']','[');
        combination.put('}','{');
        for(int i = 0 ; i< s.length(); i++) {
            if(open.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if(stack.size() == 0) return false;
                char pop = stack.pop();
                if(pop != combination.get(s.charAt(i))) return false;
            }
        }
        if(stack.size() == 0) return true;
        return false;
    }
}


