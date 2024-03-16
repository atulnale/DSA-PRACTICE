package problem66;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public static int sumOfAllDivisors(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=  (n / i) * i;
        }
        return sum;
    }

}