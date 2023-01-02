# Get min at pop
## Easy
<div class="problems_problem_content__Xm_eO"><p><em><span style="font-size:18px">Now, we'll try to solve a famous stack problem. </span></em><br>
<span style="font-size:18px">You are given an array <strong>A</strong> of size <strong>N</strong>. You need to first push the elements of the array into a stack and then print minimum in the stack at each pop until stack becomes empty.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 5
A = {1 2 3 4 5}
<strong>Output</strong>: 
1 1 1 1 1
<strong>Explanation</strong>: 
After pushing elements to the stack, 
the stack will be "top -&gt; 5, 4, 3, 2, 1". 
Now, start popping elements from the stack
popping&nbsp;5: min in&nbsp;the stack is&nbsp;1.popped 5
popping&nbsp;4: min in the stack is 1. popped 4
popping&nbsp;3: min in the stack is&nbsp;1. popped 3
popping 2: min in the stack is 1. popped 2
popping 1: min in the stack is 1. popped 1
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: 
N = 7
A = {1 6 43 1 2 0 5}
<strong>Output</strong>: 
0 0 1 1 1 1 1
<strong>Explanation</strong>: 
After pushing the elements to the stack, 
the stack will be 5-&gt;0-&gt;2-&gt;1-&gt;43-&gt;6-&gt;1. 
Now, poping the elements from the stack:
popping 5: min in the stack is 0. popped 5
popping 0: min in the stack is 0. popped 0
popping 2: min in the stack is 1. popped 2
popping 1: min in the stack is 1. popped 1
popping 43: min in the stack is 1. 
&nbsp;           popped 43
popping 6: min in the stack is 1. popped 6
popping 1: min in the stack is 1. popped 1.
</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Since this is a function problem, you don't need to take any input. Just complete the provided functions <strong>_push()</strong> and <strong>_getMinAtPop().&nbsp;</strong>The _push() function takes an array as parameter, you need to push all elements of this array onto a stack and return the stack. The _getMinAtPop() accepts a stack as a parameter which is returned by _push() function and prints minimum in the stack at each pop separated by spaces.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><br>
<strong><span style="font-size:18px">Constraints:</span></strong><br>
<span style="font-size:18px">0 &lt;= A<sub>i</sub> &lt;= 10<sup>7</sup></span></p>
</div>