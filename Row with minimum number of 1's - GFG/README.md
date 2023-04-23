# Row with minimum number of 1's
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a 2D binary matrix A of dimensions NxM, determine the row that contains a minimum number of 1's.<br>
Note-The matrix contains only 1s and 0s. Also, if two or more rows contain the minimum number of 1's, the answer is the lowest of those indices.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N=4,M=4
A=[[1,1,1,1],[1,1,0,0],[0,0,1,1],[1,1,1,1]]
<strong>Output:</strong>
2
<strong>Explanation:</strong>
Rows 2 and 3 contain the minimum number 
of 1's(2 each).Since, 2 is less than 3.
Thus, the answer is 2.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N=3,M=3
A=[[0,0,0],[0,0,0],[0,0,0]]
<strong>Output:</strong>
1
<strong>Explanation:</strong>
All the rows contain the same number 
of 1's(0 each).Among them, index 1 
is the smallest, so the answer is 1.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>minRow()</strong> which takes the two integers N, M as well as the 2D matrix A as input parameters and returns the minimum&nbsp;index of the row which contains the least number of 1's.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>O(N*M)<br>
<strong>Expected Auxillary Space:</strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N,M &lt;= 1000</span></p>

<p><span style="font-size:18px">0 &lt;= A[i][j] &lt;= 1</span></p>
</div>