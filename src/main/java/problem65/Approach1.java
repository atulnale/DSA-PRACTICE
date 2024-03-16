package problem65;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    public boolean isArmstrong(int n) {
        int temp = n;
        List<Integer> numbers = new ArrayList<>();
        while(temp != 0){
            numbers.add(temp % 10);
            temp = temp / 10;
        }
        int sum = 0;
        for(Integer num : numbers){
            sum += Math.pow(num,numbers.size());
        }
        if(sum == n) return true;
        return false;
    }

}