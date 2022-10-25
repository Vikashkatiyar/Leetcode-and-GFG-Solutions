# Count pair sum
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two sorted arrays(arr1[] and arr2[]) of size <strong>M</strong>&nbsp;and <strong>N</strong>&nbsp;of distinct elements. Given a value <strong>Sum</strong>. The problem is to count all pairs from both arrays whose sum is equal to <strong>Sum.</strong><br>
<strong>Note:</strong>&nbsp;The pair has an element from each array.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8} 
<strong>Output:</strong> 2
<strong>Explanation</strong>: The pairs are:&nbsp;<strong>(5, 5) and (7, 3).</strong>  </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N=4, M=4, sum=5 
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
<strong>Output:</strong> 0</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>countPairs</strong>() that takes <strong>array&nbsp;arr1, array&nbsp;arr2, integer M, integer N&nbsp;and integer x&nbsp;</strong>as parameters and return the count of all pairs from both arrays whose sum is equal to x.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(M+N).<br>
<strong>Expected Auxiliary Space:</strong> O(1).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ M, N ≤ 10<sup>5</sup></span></p>

<p>&nbsp;</p>
</div>