class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] distances = new int[mat.length][mat[0].length];
        
        // max possible distance would occur when the worst case happen
        int maxPossibleDistance = mat.length - 1 + mat[0].length - 1;
        
        // top to bottom, left to right
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] != 0){
                    int upcell = (i > 0) ?  distances[i-1][j]: maxPossibleDistance;
                    int leftcell = (j > 0) ? distances[i][j-1]: maxPossibleDistance;
                    distances[i][j] = Math.min(upcell, leftcell) + 1;
                }
            }
        }
        
        // bottom to top, right to left
        for(int i = mat.length - 1; i >= 0; i--){
            for(int j = mat[0].length - 1; j >=0; j--){
                if(mat[i][j] != 0){
                    int downcell = (i < mat.length -1 ) ? distances[i+1][j]: maxPossibleDistance;
                    int rightcell = (j < mat[0].length - 1) ? distances[i][j+1]:maxPossibleDistance;
                    distances[i][j] = Math.min( Math.min(downcell, rightcell) + 1, distances[i][j]) ;
                }
            }
        }
        return distances;
    }
}