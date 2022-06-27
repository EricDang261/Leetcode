class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merge = new LinkedList<>();
        
        for(int[] currentMeeting : intervals){
            if(merge.isEmpty() || merge.getLast()[1] < currentMeeting[0]){
                merge.add(currentMeeting);
            }else{
                merge.getLast()[1] = Math.max(merge.getLast()[1], currentMeeting[1]);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
}