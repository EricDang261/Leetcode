class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // define a list
        List<int[] > list = new LinkedList<>();
        
        int i = 0, n = intervals.length;
        // 1. add all intervals that are non-overlapping to the newInterval
        
        while(i < n && intervals[i][1] < newInterval[0]){
            list.add(intervals[i++]);
        }
        // 2. merge newInterval with the overlapping interval
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]); // get & set the start time 
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]); // get & set the end time
            i++;
        } 
        
        list.add(newInterval);
        // 3. add the remaining intervals onto the list
        while (i < n){
            list.add(intervals[i++]);
        }
        
        // 4. return the list
        return list.toArray(new int[list.size()][2]);
    }
}