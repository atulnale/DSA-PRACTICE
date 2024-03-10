package problem56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Approach1 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0],o2[0]));
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        int[] merged = intervals[0];
        for (int i = 0; i < n-1; i++) {
            if((merged[0]<=intervals[i+1][0] && intervals[i+1][0] <= merged[1]) || (intervals[i+1][0]<=merged[0] && merged[0] <= intervals[i+1][1])){
                merged = new int[]{Math.min(merged[0],intervals[i+1][0]),Math.max(merged[1],intervals[i+1][1])};
            } else{
                result.add(new int[]{merged[0],merged[1]});
                merged = intervals[i+1];
            }
        }
        result.add(merged);
        return result.toArray(new int[result.size()][]);
    }

}