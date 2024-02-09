package problem14;


import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];

    }
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        if(first.length() == 0) return "";
        TrieNode trieNode = new TrieNode();
        TrieNode curr = trieNode;
        int end = first.length();
        for(Character ch : first.toCharArray()) {
            int index = ch - 'a';
            curr.children[index] = new TrieNode();
            curr = curr.children[index];
        }
        for(int i = 1; i < strs.length; i++) {
            String str = strs[i];
            curr = trieNode;
            if(str.length() == 0) {
                return "";
            }
            int count = 0;
            for(Character ch : str.toCharArray()){
                int index = ch - 'a';
                if(curr == null || curr.children[index]== null){
                    break;
                }
                curr = curr.children[index];
                count++;
            }
            end = Math.min(count, end);
        }
        return first.substring(0,end);
    }
}
