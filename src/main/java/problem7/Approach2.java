package problem7;

public class Approach2 {
    public int reverse(int x) {
        int res = 0;
        while(x != 0){
            int temp = x % 10;
            int rev = (res * 10 ) + temp;
            if((rev - temp) / 10 != res) return 0;
            res = rev;
            x= x/10;
        }
        return res;
    }
}
