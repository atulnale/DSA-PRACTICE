package problem67;

public class Approach1 {
    static int[] arr;
    public static int[] printNos(int x) {
        arr = new int[x];
        helper(0,x);
        return arr;
    }

    private static void helper(int i, int x) {
        if(i == x) return;
        arr[i] = i + 1;
        helper(i+1, x);
    }
}