class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int minPath = Integer.MAX_VALUE;
        Integer [][] memo = new Integer[matrix.length][matrix[0].length];
        int row = 0;
        for(int j = 0; j < matrix.length; j++){
            minPath = Math.min(minPath, findMinPath(matrix, row, j, memo));
        }
        return minPath;
    }
    
    public int findMinPath(int[][] matrix, int row, int col, Integer[][]memo){
        // check if we hit out of the boundary of the matrix
        if(col < 0 || col == matrix.length) return Integer.MAX_VALUE;
        // check if we hit the last row
        if(row == matrix.length -1){
            return matrix[row][col];
        }
        // check if we have compute this result before
        if(memo[row][col] != null){
            return memo[row][col]; // it has been computed
        }

        int left = findMinPath(matrix, row+1, col-1, memo);
        int middle = findMinPath(matrix, row+1 ,col, memo);
        int right = findMinPath(matrix, row+1, col+1, memo);
        
        memo[row][col] = Math.min(left, Math.min(middle, right)) + matrix[row][col];
        return memo[row][col];
    }
}
