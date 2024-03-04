package problem49;

import java.util.*;

public class Approach1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        String[] sorted = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            sorted[i] = new String(charArray);
        }
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {

            List<String> li = map.getOrDefault(sorted[i], new ArrayList<>());
            li.add(strs[i]);
            map.put(sorted[i], li);
        }
        for(String str: map.keySet()){
            res.add(map.get(str));
        }
        return res;
    }
}