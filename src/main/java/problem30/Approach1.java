package problem30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Approach1 {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = s.length();
        var result = new ArrayList<Integer>();
        int wordLen = words[0].length();
        var wordToFreq = new HashMap<String, Integer>();
        var totalWords = words.length;
        for(String word: words) {
            wordToFreq.put(word, wordToFreq.getOrDefault(word, 0)+1);
        }

        for(int i = 0 ; i < wordLen; i++){
            var remaining = totalWords;
            var seen = new HashMap<String, Integer>();
            for(int left=i, right = i; right <= n - wordLen; right += wordLen){
                var target = s.substring(right, right + wordLen);
                if(!wordToFreq.containsKey(target)){
                    seen.clear();
                    left = right+wordLen;
                    remaining = totalWords;

                } else {
                    seen.put(target, seen.getOrDefault(target,0)+1);
                    while(seen.get(target)> wordToFreq.get(target)){
                        var removed = s.substring(left,left+wordLen);
                        left = left + wordLen;
                        seen.put(removed, seen.get(removed)-1);
                        remaining++;
                    }
                    remaining--;
                }
                if(remaining == 0){
                    result.add(left);
                }
            }
        }
        return result;
    }
}