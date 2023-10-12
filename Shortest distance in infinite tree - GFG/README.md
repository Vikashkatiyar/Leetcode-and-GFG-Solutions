# Shortest distance in infinite tree
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Consider you have an infinitely long binary tree having the&nbsp;pattern as below<br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1</span></p>

<p><span style="font-size:18px">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /&nbsp; &nbsp; &nbsp;\<br>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;2 &nbsp; &nbsp; &nbsp;3&nbsp;&nbsp;</span></p>

<p><span style="font-size:18px">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;/&nbsp; \&nbsp; &nbsp; &nbsp;/&nbsp; &nbsp;\<br>
&nbsp; &nbsp; &nbsp; &nbsp; 4&nbsp; 5 &nbsp; &nbsp;6 &nbsp;7<br>
&nbsp; &nbsp; .&nbsp; . &nbsp;. &nbsp;. &nbsp; . &nbsp;. &nbsp;.&nbsp; .&nbsp;<br>
Given two nodes with values x and y,&nbsp;the task is to find the length of the shortest path between the two nodes.</span></p>

<p><span style="font-size:20px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
X = 1
Y = 3
<strong>Output:</strong>
1
<strong>Explanation:
</strong>3 is the child of 1 so, 
distance between them is 1.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
X = 2
Y = 2
<strong>Output:</strong>
0
<strong>Explanation:</strong>
There is no node between 2 and 2.</span><span style="font-size:20px">
</span></pre>

<p><span style="font-size:18px"><strong>Your Task: </strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>distance()</strong>&nbsp;which take&nbsp;integers&nbsp;<strong>X and Y</strong>&nbsp;as&nbsp;input parameters and returns the distance between X and Y in the infinitely&nbsp;long tree.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(log (y - x))<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=X,Y&lt;=10<sup>7</sup></span></p>
</div>