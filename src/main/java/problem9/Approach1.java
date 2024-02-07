package problem9;

public class Approach1 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int result = 0;
        int tempX = x;
        while(tempX != 0){
            int temp = tempX % 10;
            result = result * 10 + temp;
            tempX = tempX / 10;
        }
        if(result == x) return true;
        return false;
    }
}
