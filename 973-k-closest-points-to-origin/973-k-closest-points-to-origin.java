class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length; // get how many coordinates
        int[] dists = new int[n]; // array holds the distance of the coordinates
        // calculate the distance
        for(int i = 0; i < n; i++){
            dists[i] = dist(points[i]);
        }
        // sort the arrays ascending order
        Arrays.sort(dists); 
        // get coordinates according to k
        // for example: k = 1 -> first index, k = 2 -> second index
        int distK = dists[k-1];
        
        int[][] ans = new int[k][2];
        int t = 0; // index iterator 
        for(int i = 0; i < n; i++){
            if(dist(points[i]) <= distK){
                ans[t++] = points[i];
            }
        }
        
        return ans;
    }
    
    public int dist(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}