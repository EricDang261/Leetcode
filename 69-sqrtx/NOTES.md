```
Algorithm
​
If x < 2, return x.
​
Set the left boundary to 2, and the right boundary to x / 2.
​
While left <= right:
​
Take num = (left + right) / 2 as a guess. Compute num * num and compare it with x:
​
If num * num > x, move the right boundary right = pivot -1
​
Else, if num * num < x, move the left boundary left = pivot + 1
​
Otherwise num * num == x, the integer square root is here, let's return it
​
Return right
```