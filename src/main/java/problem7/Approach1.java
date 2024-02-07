package problem7;

public class Approach1 {
    public int reverse(int x) {
        Long num = (long) x;
        Long res = 0L;
        int mul = 1;
        while(num != 0){
            int temp = (int) (num % 10);
            num = num / 10;
            res = res * mul + temp;
            mul = 10;
        }
        if(res >= Integer.MAX_VALUE || res <=Integer.MIN_VALUE) return 0;
        return (int) (res * 1);
    }
}
