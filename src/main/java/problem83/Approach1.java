package problem83;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Approach1 {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        int[] freq = new int[26];
        for(char ch : tasks) {
            freq[ch - 'A']++;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if(freq[i] > 0){
                maxHeap.offer(freq[i]);
            }
        }
        while(!maxHeap.isEmpty()){
            List<Integer> store = new ArrayList<>();
            int count = n + 1;
            int task = 0;
            while(count-- > 0 && !maxHeap.isEmpty()){
                Integer currFreq = maxHeap.poll();
                if(currFreq > 1){
                    store.add(currFreq - 1);
                }
                task++;
            }
            store.forEach(maxHeap :: offer);
            time += maxHeap.isEmpty() ? task : n+1;
        }
        return time;
    }
}