class Solution {
public:
    // function perform depth first search
    // require recursion
    // -> need base case
    void dfs(vector<vector<int>> & image, int r, int c, int targetColor, int color){
        if(image[r][c] == targetColor){
            // set to required color
            image[r][c] = color;
            
            // recursive
            // as long as it's in the matrix frame -> keep checking and replacing
            // 4 direction from the target point
            if(r >= 1) dfs(image, r -1, c, targetColor, color); // top
            if(c >= 1) dfs(image, r, c - 1, targetColor, color); // left
            if(r + 1 < image.size()) dfs(image, r +1 , c, targetColor, color); // bottom
            if(c + 1 < image[0].size()) dfs(image, r, c + 1, targetColor, color);// right
        }
    }
    
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int targetColor = image[sr][sc];
        // dont need to handle visitted array -> no infinite loop
        if(targetColor != color) dfs(image, sr, sc, targetColor, color);
        return image; // else just return the original image
    }
};

// time complexity is O(m x n ) where m is number of pixels in one row, n is the total pixels in column
// space complexity is (n) size of the implicit call stack when calling dfs recursively.