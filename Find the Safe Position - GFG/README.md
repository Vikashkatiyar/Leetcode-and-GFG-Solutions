# Find the Safe Position
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">There are <strong>n</strong> people standing in a circle (<strong>numbered clockwise 1 to n</strong>) waiting to be executed. The counting begins at point <strong>1</strong> in the circle and proceeds around the circle in a fixed direction (<strong>clockwise</strong>). In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given <strong>freedom</strong>.<br>
Given the total number of persons <strong>n</strong> and a number <strong>k</strong> which indicates that <strong>k-1 </strong>persons are skipped and <strong>k<sup>th</sup></strong> person is killed in circle. The task is to choose the place in the initial circle so that you are the last one remaining and so survive.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>n = </strong>2, <strong>k = </strong>1</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">2</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Here, n = 2 and k = 1, then safe position is
2 as the person at 1st position will be killed.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>n = </strong>4, <strong>k = </strong>2</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The safe position is 1.
</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>safePos()</strong> which takes an Integer n as input and returns the safe position.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n*n)<br>
<strong>Expected Auxiliary Space:</strong> O(n)</span></p>

<p><span style="font-size:18px"><strong>Follow up:</strong> This problem can be solved in linear time. Can you come up with a solution?</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= n,k &lt;= 500</span></p>
</div>