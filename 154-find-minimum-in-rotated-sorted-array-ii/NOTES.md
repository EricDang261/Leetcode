Discussion

The problem is a follow-up to the problem of 153. Find Minimum in Rotated Sorted Array. The difference is that in this problem the array can contain duplicates. So the question is "Would allow duplicates affect the run-time complexity? How and why?"

First of all, the problem of 153. Find Minimum in Rotated Sorted Array can be considered as a specific case of this problem, where it just happens that the array does not contain any duplicate. As a result, the very solutions of this problem would work for the problem of #153 as well. It is just that we would never come cross the case #3 (i.e. nums[pivot] == nums[high]) in the problem of #153.

It is due to the fact that there might exist some duplicates in the array, that we come up the case #3 which eventually render the time complexity of the algorithm to be linear \mathcal{O}(N)O(N), rather than \mathcal{O}(\log_{2}{N})O(log2N).

One might wonder that whether it works in case #3 if we move the lower boundary (i.e. low += 1), rather than the upper boundary (i.e. high -= 1).

The short answer is that it could work for some cases, but not for all. For instance, given the input [1, 3, 3], by moving the lower boundary, we would skip the correct answer.

While we do low = pivot + 1 to reduce the search scope, then why not do high = pivot - 1 instead of high = pivot? Or a similar question would be "why don't we do check of low <= high rather than low < high"?

As a matter of fact, the binary search algorithm has several forms of implementation, regarding how we set the boundaries and the loop conditions. One can refer to the Explore card of Binary Search in LeetCode for more details. As simple as the idea of binary search might seem to be, it is tricky to make it work for all cases.

As one would discover from the card, the above implementation of binary search complies with the template II of binary search. And by replacing high = pivot with high = pivot - 1, the algorithm will not work.

As subtle as it looks like, the update of the pointers should be consistent with the conditions of the loop. As a rule of thumb, it is advised to stick with one form of binary search, and not to mix them up.

One might notice that we are calculating the pivot with the formula of pivot = low + (high-low)/2, rather than the more intuitive term pivot = (high+low)/2.

Actually, this is done intentionally to prevent the numeric overflow issue, since the sum of two integers could exceed the limit of the integer number. As a fun fact, the above mistake prevails in many implementations of binary search, as revealed from a post titled "Nearly All Binary Searches and Mergesorts are Broken" from googleblog in 2006.
