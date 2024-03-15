package problem62;

import utils.ListNode;

public class Approach1 {
    public static int countDigits(int n){
        int result = 0;
        int temp = n;
        while(temp != 0){
            int curr = temp % 10;
            if(curr != 0 && n % curr == 0) result++;
            temp = temp/ 10;
        }
        return result;
    }

}