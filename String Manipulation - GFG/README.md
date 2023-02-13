# String Manipulation
## Easy
<div class="problems_problem_content__Xm_eO"><div class="starwars-lab">
<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif">Tom is a string freak. He has got sequences of&nbsp; n words to manipulate. If in a sequence, two same words come together then hell destroy each other. He wants to know the number of words left in the sequence after this pairwise destruction.</span></span><br>
&nbsp;</p>

<div class="starwars-lab">
<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Example 1:</strong></span></span></p>

<pre><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Input:</strong>
5
v[] = {"ab", "aa", "aa", "bcd", "ab"}
<strong>Output:</strong>
3<strong>
Explanation:</strong>
ab aa aa bcd ab
After the first iteration, we'll have: ab bcd ab
We can't further destroy more strings and
hence we stop and the result is 3. </span></span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Example 2:</strong></span></span></p>

<pre><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Input:</strong>
4
v[] = {"tom", "jerry", "jerry", "tom"}
<strong>Output:</strong>
0
<strong>Explanation:
</strong>tom jerry jerry tom
After the first iteration, we'll have: tom tom
After the second iteration: 'empty-array' 
Hence, the result is 0. </span></span></pre>
</div>

<p><br>
&nbsp;</p>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>removeConsecutiveSame()</strong>&nbsp;which takes the array <strong>A[]</strong> and its size <strong>N</strong><strong> </strong>as inputs and returns the number of words left per sequence.</span></span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space: </strong>O(N)<br>
<br>
<br>
<strong>Constraints:</strong><br>
1 ≤ N ≤ 100<br>
1 ≤ |S<sub>i</sub>| ≤ 50</span></span></p>
</div>
</div>