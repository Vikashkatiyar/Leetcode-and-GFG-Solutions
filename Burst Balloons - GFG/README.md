# Burst Balloons
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given <strong>N</strong>&nbsp;balloons, indexed from <strong>0</strong> to <strong>n - 1</strong>. Each balloon is painted with a number on it represented by an array <strong>arr.</strong> You are asked to brust all the balloons.<br>
If you brust the <strong>i</strong><sup><strong>th&nbsp;</strong>&nbsp;</sup>balloon,, you will get <strong>arr[ i - 1 ] * arr[ i ] * arr[ i + 1]</strong> coins. If <strong>i - 1</strong>, or<strong> i + 1</strong> goes out of bounds of the array, consider it as if there is a balloon with a <strong>1</strong> painted on it.<br>
Return the <strong>maximum</strong> coins you can collect by brusting the balloons wisely.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<div style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor:#222426; --darkreader-inline-border-top:#3e4446; --darkreader-inline-border-right:#3e4446; --darkreader-inline-border-bottom:#3e4446; --darkreader-inline-border-left:#3e4446;"><span style="font-size:18px"><strong>Input:</strong><br>
N = 4<br>
arr[ ] = {3, 1, 5, 8}<br>
<strong>Output: </strong>167<br>
<strong>Explanation:</strong>&nbsp;<br>
arr[ ] = {3, 1, 5, 8}&nbsp; - - &gt; {3, 5, 8} - - &gt; {3, 8} - - &gt; { 8} - -&gt; { }<br>
coins = 3 *1 *5,&nbsp; &nbsp; &nbsp; +&nbsp; &nbsp; &nbsp; 3*5*8&nbsp; &nbsp; &nbsp;+&nbsp; &nbsp;1*3*8&nbsp; &nbsp;+&nbsp; 1*8*1&nbsp; &nbsp;= 167</span><br>
&nbsp;</div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<div style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor:#222426; --darkreader-inline-border-top:#3e4446; --darkreader-inline-border-right:#3e4446; --darkreader-inline-border-bottom:#3e4446; --darkreader-inline-border-left:#3e4446;"><span style="font-size:18px"><strong>Input:</strong><br>
N = 2<br>
arr[ ] = {1, 10}<br>
<strong>Output:&nbsp;</strong>20</span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>maxCoins()</strong>&nbsp;which takes the&nbsp;array of&nbsp;integers&nbsp;<strong>arr </strong>and <strong>N&nbsp;</strong>as parameters and returns the maximum coin you can collect.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*N<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N*N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 300<br>
0<sup>&nbsp;</sup>≤ arr<sub>i&nbsp; </sub>≤ 100</span></p>
</div>