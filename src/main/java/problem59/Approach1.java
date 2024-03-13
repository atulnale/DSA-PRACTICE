package problem59;

public class Approach1 {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int count = 1;
        for (int layer = 0; layer < (n+1 )/2; layer++) {
            for (int ptr = layer; ptr < n - layer ; ptr++) {
                mat[layer][ptr] = count++;
            }
            for (int ptr = layer+1; ptr < n - layer ; ptr++) {
                mat[ptr][n-layer-1] = count++;
            }
            for (int ptr = layer + 1; ptr < n-layer ; ptr++) {
                mat[n-layer - 1][n-ptr-1] = count++;
            }
            for (int ptr = layer + 1; ptr < n - layer - 1; ptr++) {
                mat[n - ptr - 1][layer] = count++;
            }
        }
        return mat;
    }

}