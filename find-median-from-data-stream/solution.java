class MedianFinder {

    Queue<Integer> small_heap;
    Queue<Integer> large_heap;

    public MedianFinder() {
        small_heap = new PriorityQueue<>((a, b) -> b - a ); // max heap
        large_heap = new PriorityQueue<>((a,b) -> a - b); // min heap
    }
    
    public void addNum(int num) {
        small_heap.add(num);
        // the size of 2 heaps should not be different than 1
        // the max val of min heap <= the min val of max heap
        if(small_heap.size() > large_heap.size() + 1 ||
           !large_heap.isEmpty() && small_heap.peek() > large_heap.peek())
        {
            large_heap.add(small_heap.poll());
        }
        if(large_heap.size() > small_heap.size() + 1){
            small_heap.add(large_heap.poll());
        }    
    }
    
    public double findMedian() {
        if(small_heap.size() > large_heap.size()){
            return (double) small_heap.peek();
        }else if(large_heap.size() > small_heap.size()){
            return (double) large_heap.peek();
        }else{
            return (double) (small_heap.peek() + large_heap.peek()) / 2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
