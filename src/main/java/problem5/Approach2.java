package problem5;

public class Approach2 {
    String result = "";
    public String longestPalindrome(String s) {
        if(s.length() == 1)
            return s;
        int n =  s.length();
        boolean[][] dp = new boolean[n][n];
        for(int g = 0; g < n; g++) {
            for(int i = 0, j = g; j<n; i++,j++){
                if(g == 0){
                    dp[i][j] = true;
                } else if(g == 1 ) {
                    if(s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        for(int i = 0; i< n; i++){
            for(int j = i; j<n; j++) {
                if(dp[i][j] && j - i + 1 > result.length()){
                    result = s.substring(i,j+1);
                }
            }
        }
        return result;
    }
}
