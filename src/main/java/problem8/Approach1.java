package problem8;

public class Approach1 {
    public int myAtoi(String s) {
        int result = 0;

        int i = 0;
        while(i < s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
                continue;
            }
            break;

        }
        int sign = 1;
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }
        if(i < s.length() && !(s.charAt(i)>= '0' && s.charAt(i)<='9')){
            return 0;
        }
        while(i < s.length() && s.charAt(i)>= '0' && s.charAt(i)<='9') {
            int temp = s.charAt(i) % '0';
            if(result >= Integer.MAX_VALUE / 10){
                if(result > Integer.MAX_VALUE / 10 ){
                    if(sign == -1) return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                if(result == Integer.MAX_VALUE / 10 ) {
                  if(sign == -1 )  {
                      if(!(s.charAt(i)>= '0' && s.charAt(i)<='7')){
                          return  Integer.MIN_VALUE;
                      }

                  } else {
                      if(!(s.charAt(i)>= '0' && s.charAt(i)<='7')){
                          return  Integer.MAX_VALUE;
                      }
                  }
                }

            }

            result =  result * 10 + temp;

            i++;
        }
        return result * sign;
    }
}
