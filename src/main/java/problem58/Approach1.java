package problem58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Approach1 {
    public int lengthOfLastWord(String s) {
        int counter  = 0;
        int currWord = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                if(currWord != 0){
                    counter = currWord;
                }
                currWord = 0;
            } else {
                currWord++;
            }
        }
        if(currWord != 0) return currWord;
        return counter;
    }

}