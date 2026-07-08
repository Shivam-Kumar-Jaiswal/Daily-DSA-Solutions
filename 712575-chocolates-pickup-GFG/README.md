# [Chocolates Pickup](https://www.geeksforgeeks.org/problems/chocolates-pickup/1)
## Hard
You are given a 2D matrix grid[][] of size n*m,&nbsp;where each cell grid[i][j] represents the number of chocolates available at position (i, j).
Two robots are collecting chocolates from this grid:

Robot 1 starts at the top-left corner (0, 0)
Robot 2 starts at the top-right corner (0, m - 1)

Your task is to determine the maximum total number of chocolates both robots can collect while following these rules:

From a cell&nbsp;(i, j), robots can move to cell&nbsp;(i + 1, j - 1),&nbsp;(i + 1, j), or&nbsp;(i + 1, j + 1).
When a robot visits a cell, it collects all the chocolates there.
If both robots land on the same cell, the chocolates in that cell are collected only once.
Robots cannot move outside the boundaries of the grid.
Both robots must continue moving until they reach the bottom row of the grid.

Example:
Input: grid[][] = [[4, 1, 2], [3, 6, 1], [1, 6, 6], [3, 1, 2]]
Output: 32
Explanation: The path followed by first robot is: (0, 0) -&gt; (1, 0) -&gt; (2, 1) -&gt; (3, 0), so first robot collected: 4 + 3 + 6 + 3 = 16 chocolates.The path followed by second robot is: (0, 2) -&gt; (1, 1) -&gt; (2, 2) -&gt; (3, 2), so second robot collected: 2 + 6 + 6 + 2 = 16 chocolates.Total both robots collected 16 + 16 = 32 chocolates.
Constraint:2 ≤ n, m ≤ 700 ≤ grid[i][j] ≤ 100