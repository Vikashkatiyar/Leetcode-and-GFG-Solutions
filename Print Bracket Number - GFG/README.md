# Print Bracket Number
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string S, the task is to find the bracket numbers.&nbsp;</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>  S = "(aa(bdc))p(dee)</span><span style="font-size:20px">â€‹</span><span style="font-size:18px">"
<strong>Output:</strong> 1 2 2 1 3 3
<strong>Explanation:</strong> The highlighted brackets in
the given string <strong>(</strong>aa<strong>(</strong>bdc<strong>))</strong>p<strong>(</strong>dee<strong>)</strong> has been 
assigned the numbers as: 1 2 2 1 3 3.</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>  S = "(((()("
<strong>Output:</strong> 1 2 3 4 4 5
<strong>Explanation:</strong> The highlighted brackets in
the given string <strong>(((()(</strong> has been assigned
the numbers as: 1 2 3 4 4 5</span>
</pre>

<div><span style="font-size:18px"><strong>User Task:</strong><br>
Your task is to complete the function <strong><code>barcketNumbers</code>()&nbsp;</strong>which takes a single string as input and returns a list of numbers. You do not need to take any input or print anything.</span></div>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(|S|)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(|S|)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |S| &lt;= 10<sup>5</sup></span><br>
<span style="font-size:18px">S contains lower case English alphabets, and '(', ')' characters<br>
At any time the number of opening brackets are greater than closing brackets</span></p>
</div>