package problem104;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int ele : nums) {
            set.add(ele);
        }
        int longestStreak = 0;

        for (Integer ele : set) {
            if(!set.contains(ele-1)){
                int currStreak = 1;
                int currNum = ele;
                while(set.contains(currNum + 1)){
                    currNum+=1;
                    currStreak +=1;
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }

        return longestStreak;
    }
}