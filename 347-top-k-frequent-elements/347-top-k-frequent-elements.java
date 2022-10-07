class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // { 1 = 3 ; 2 =  2; 3 =  1}
        // get the priority queue to sort the most frequent appear
        PriorityQueue<Integer> priQueue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        
        for(int i : map.keySet()){
            priQueue.add(i);
        };
        
        // priQueue = { 1,2,3}
        for(int i = 0 ; i < k; i++){
            res.add(priQueue.poll());
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}