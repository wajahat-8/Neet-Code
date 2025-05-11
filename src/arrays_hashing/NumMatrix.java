// You can remove or change the package if needed
// package arrays_hashing;

public class NumMatrix {
    private int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        prefixSum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefixSum[i][j] = matrix[i][j];
                if (i > 0) prefixSum[i][j] += prefixSum[i - 1][j];
                if (j > 0) prefixSum[i][j] += prefixSum[i][j - 1];
                if (i > 0 && j > 0) prefixSum[i][j] -= prefixSum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = prefixSum[row2][col2];
        if (row1 > 0) sum -= prefixSum[row1 - 1][col2];
        if (col1 > 0) sum -= prefixSum[row2][col1 - 1];
        if (row1 > 0 && col1 > 0) sum += prefixSum[row1 - 1][col1 - 1];
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix obj = new NumMatrix(matrix);
        System.out.println(obj.sumRegion(2, 1, 4, 3)); // Expected: 8
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // Expected: 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // Expected: 12
    }
}
