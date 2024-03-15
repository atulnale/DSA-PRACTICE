package problem63;

public class Approach1 {
    public static int calcGCD(int n, int m){
        if(n < m){
            return calcGCD(m,n);
        }
        if(m == 0) return n;
        return calcGCD(m, n % m);
    }

}