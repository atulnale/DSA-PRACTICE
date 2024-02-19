package problem29;

public class Approach1 {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1) return dividend;
        int sign = 2;
        if(dividend > 0 ) {
            dividend = -dividend;
            sign--;
        }
        if(divisor > 0 ) {
            divisor = -divisor;
            sign--;
        }
        int quotient = 0;
        while(dividend <= divisor){
            if(dividend == 0) break;
            dividend -= divisor;
            quotient++;
        }
        if(sign == 0 || sign == 2) return quotient;
        return -quotient;

    }
}


