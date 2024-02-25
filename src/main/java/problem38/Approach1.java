package problem38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Approach1 {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String resp = countAndSay(n - 1);
        int counter = 0;
        char ch = resp.charAt(0);
        int i = 0;
        StringBuilder result = new StringBuilder();
        while(i < resp.length()){
            if(ch == resp.charAt(i)){
                counter++;
            } else {
                result.append(counter).append(ch);
                counter = 0;
                ch = resp.charAt(i);
                i--;
            }
            i++;
        }
        if(counter != 0){
            result.append(counter).append(ch);
        }
        return result.toString();
    }
}