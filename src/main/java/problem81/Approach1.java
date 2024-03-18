package problem81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Approach1 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            int[] interval = points[i];
            while(i < points.length && isOverlapping(interval, points[i])){
                interval = mergeInterval(interval, points[i]);
                i++;
            }
            list.add(interval);
            i--;
        }
        return list.size();
    }

    private int[] mergeInterval(int[] interval, int[] point) {
        return new int[] {Math.max(interval[0], point[0]), Math.min(interval[1], point[1])};
    }

    private boolean isOverlapping(int[] interval, int[] point) {
        return Math.max(interval[0], point[0]) <= Math.min(interval[1],point[1]);
    }
}