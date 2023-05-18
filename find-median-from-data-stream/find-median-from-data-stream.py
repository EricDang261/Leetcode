class MedianFinder:

    def __init__(self):
        # defines 2 heaps/ priority queue
        self.small_vals = [] # max_heap
        self.large_vals = [] # min_heap 
        
    def addNum(self, num: int) -> None:
        if self.large_vals and num > self.large_vals[0]:
            heapq.heappush(self.large_vals, num)
        else:
            heapq.heappush(self.small_vals, -1 * num)
        
        ''' 
            The size of the 2 heaps should not be greater than 1
        '''
        if len(self.small_vals) > len(self.large_vals) + 1:
            val = -1 * heapq.heappop(self.small_vals)
            heapq.heappush(self.large_vals, val)
        elif len(self.large_vals) > len(self.small_vals) + 1:
            val = heapq.heappop(self.large_vals)
            heapq.heappush(self.small_vals, -1 *val)


    def findMedian(self) -> float:
        if len(self.small_vals) > len(self.large_vals):
            return -1 * self.small_vals[0]
        elif len(self.large_vals) > len(self.small_vals):
            return self.large_vals[0]
        return ((-1)* self.small_vals[0] + self.large_vals[0]) / 2



# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()