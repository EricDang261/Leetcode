class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length; // rows
        int n = board[0].length; // collumn
        
        for(int i =0; i < m ; ++i){
            for(int j = 0; j < n; ++j){
                if (check(board, word, i, j, m, n, 0)) {
                    return true;
                }
            }
        }
            return false;
    }
            
    public boolean check(char[][] board, String word,
                             int i , int j, int m, int n, 
                             int current){
            
            if(current >= word.length()) 
                return true;
            if(i < 0 || j < 0 || i>=m || j >=n || board[i][j] != word.charAt(current)) 
                return false;
            
            boolean exist = false;
            if(board[i][j] == word.charAt(current)){
                board[i][j] += 100;
                exist =
                    check(board, word, i + 1, j, m, n, current + 1) ||
                    check(board, word, i, j + 1, m, n, current + 1) ||
                    check(board, word, i - 1, j, m, n, current + 1) ||
                    check(board, word, i, j - 1, m, n, current + 1);
                board[i][j] -= 100;
            }
            return exist;
        }
}