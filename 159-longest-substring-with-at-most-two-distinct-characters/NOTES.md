Having a map to see the last index have seen  -> hashmap
having window -> left pointer and right pointer ( initilize is to be 0 )
size of the window will be r - l + 1;
to keep track of the maxLength: Math.max ( max, r - l +1)
​
Algorithm:
traverse the string
put the current char to the map with the index
- increment the right pointer to 1 if:
- there are less than 2 distinct characters in the window
else:
maxLen = max ( maxLength, r - l +1 );
increment the left pointer; the one that index is the least recent access in the map
​