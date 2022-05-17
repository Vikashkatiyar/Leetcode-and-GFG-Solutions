# Full binary tree
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a Binary Tree. Check whether the Binary tree is a full binary tree or not.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong></span><strong><span style="font-size:18px">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span></strong><span style="font-size:18px">1
&nbsp; &nbsp; &nbsp; &nbsp;/&nbsp;  &nbsp;\
&nbsp; &nbsp; &nbsp;&nbsp;2&nbsp; &nbsp; &nbsp;&nbsp;3
&nbsp; &nbsp; /&nbsp;&nbsp;&nbsp;\
&nbsp; &nbsp;4&nbsp;   &nbsp;5<strong>
Output: </strong>1<strong>
Explanation: </strong>Every node except leaf node
has two children so it is a full tree.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong></span><strong><span style="font-size:18px">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span></strong><span style="font-size:18px">1
&nbsp; &nbsp; &nbsp; &nbsp;/&nbsp;  &nbsp;\
&nbsp; &nbsp; &nbsp;&nbsp;2&nbsp; &nbsp; &nbsp;&nbsp;3
&nbsp; &nbsp; /&nbsp;&nbsp;&nbsp;
&nbsp; &nbsp;4&nbsp;   &nbsp;<strong>
Output: </strong>0<strong>
Explanation: </strong>Node 2 has only one child
so this is&nbsp;not a full tree.</span></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function</span><span style="font-size:18px"> <strong>isFullTree() </strong>which&nbsp;takes the&nbsp;root node of the tree<strong>&nbsp;</strong>as input and returns True if the given Binary Tree is full. Else, it returns False. (The driver code will print 1 if the returned value is true, otherwise 0).</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Height of the Tree).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=Number of nodes&lt;=1000</span></p>

<p><strong>Note:</strong>The <strong>Input/Ouput </strong>format and <strong>Example </strong>given are used for system's internal purpose, and should be used by a user for <strong>Expected Output</strong> only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.</p>
 <p></p>
            </div>