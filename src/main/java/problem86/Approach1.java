package problem86;

public class Approach1 {
    public void rotate(int[] nums, int k) {
        int count = 0;
        for (int start = 0; count < nums.length ; start++) {
            int prev = nums[start];
            int current = start;
            do {
                int temp = nums[(current + k) % nums.length];
                nums[(current + k) % nums.length] = prev;
                prev = temp;
                current = (current + k) % nums.length;
                count++;
            } while (start != current);
        }
    }
}