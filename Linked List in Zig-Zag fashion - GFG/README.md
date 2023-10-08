# Linked List in Zig-Zag fashion
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a <strong>L</strong>inked <strong>l</strong>ist, rearrange it such that converted list should be of the form a &lt; b &gt; c &lt; d &gt; e &lt; f .. where <strong>a, b, c</strong>&nbsp;are consecutive data node of linked list and such that the order of linked list is sustained.<br>
<strong>For example:</strong> In&nbsp;11&nbsp;15&nbsp;20&nbsp;5&nbsp;10&nbsp;we consider only&nbsp;11 20 5 15 10&nbsp;because it satisfies the above condition and the order of linked list. 5 20 11 15 10 is not considered as it does not follow the order of linked list.</span></p>

<p><span style="font-size:18px">To maintain the order, keep swapping the <strong>adjacent</strong> nodes of the linked list (whenever required)&nbsp;to get the desired output.&nbsp;&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 1-&gt;2-&gt;3-&gt;4&nbsp;
<strong>Output: </strong>1 3 2 4</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 11-&gt;15-&gt;20-&gt;5-&gt;10
<strong>Output: </strong>11 20 5 15 10<strong>
Explanation: </strong>In the given linked list,
after arranging them as 11 &lt; 20 &gt;&nbsp;5
&lt; 15 &gt;&nbsp;10 in the pattern as asked above.</span></pre>

<p><span style="font-size:18px"><strong>Your&nbsp;Task:</strong><br>
The task is to complete the function&nbsp;<strong>zigZag</strong>() which should reorder the list as required and return the head of the linked list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= size of linked list(a) &lt;= 1000</span></p>
</div>