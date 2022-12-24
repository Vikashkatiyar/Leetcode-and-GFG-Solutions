# Largest Sum Subarray of Size at least K
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array and a number k, find the largest sum of the subarray containing at least k numbers. It may be assumed that the size of array is at-least k.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input : 
</strong>n = 4
arr[] = {-4, -2, 1, -3}
k = 2
<strong>Output : </strong>
-1
<strong>Explanation :</strong>
The sub array is {-2, 1}</span></pre>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input :
</strong>n = 6<strong> </strong>
arr[] = {1, 1, 1, 1, 1, 1}
k = 2
<strong>Output : </strong>
6
<strong>Explanation :</strong>
The sub array is {1, 1, 1, 1, 1, 1}</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>maxSumWithK()</strong>&nbsp;which takes the array <strong>A[]</strong>, its size <strong>N </strong>and an integer <strong>K </strong>as inputs and returns the value of the largest sum of the subarray containing at least k numbers.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=n&lt;=10<sup>5</sup><br>
-10<sup>5</sup>&lt;=a[i]&lt;=10<sup>5</sup><br>
1&lt;=k&lt;=n</span></p>
</div>