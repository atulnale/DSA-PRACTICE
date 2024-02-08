package problem12;


public class Approach1 {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int i= 0;
            while (i < values.length) {
                if(num>=values[i]){
                    sb.append(symbols[i]);
                    num -= values[i];
                } else {
                    i++;
                }

            }
        }
        return sb.toString();
    }
}
