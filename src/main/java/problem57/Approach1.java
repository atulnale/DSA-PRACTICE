package problem57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Approach1 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        intervals = addInterval(intervals, newInterval);
        for (int i = 0; i < intervals.length; i++) {
            int[] currInterval = new int[]{intervals[i][0], intervals[i][1]};
            while(i < intervals.length && isOverlapping(intervals[i], currInterval)){
                currInterval = mergeInterval(intervals[i], currInterval);
                i++;
            }
            result.add(currInterval);
            i--;
        }
        return result.toArray(new int[result.size()][2]);
    }

    private int[] mergeInterval(int[] interval, int[] currInterval) {
        return new int[]{Math.min(interval[0], currInterval[0]), Math.max(interval[1], currInterval[1])};
    }

    private boolean isOverlapping(int[] interval, int[] currInterval) {
        return Math.min(interval[1],currInterval[1]) - Math.max(interval[0], currInterval[0]) >=0;
    }

    private int[][] addInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(Arrays.asList(intervals));
        boolean isMerged = false;
        for (int i = 0; i < intervals.length; i++) {
            if(newInterval[0]<intervals[i][0]){
                result.add(i, newInterval);
                isMerged = true;
                break;
            }
        }
        if(!isMerged){
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][2]);
    }


}