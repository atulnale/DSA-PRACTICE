package problem68;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
    static List<String> result = new ArrayList<>();
    public static List<String> printNtimes(int n){
        if(n == 0) return result;
        result.add("Coding Ninjas");
        return printNtimes(n-1);

    }
}