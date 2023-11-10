<h2><a href="https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Amazon</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1297. Maximum Number of Occurrences of a Substring</a></h2><h3>Medium</h3><hr><div><p>Given a string <code>s</code>, return the maximum number of occurrences of <strong>any</strong> substring under the following rules:</p>

<ul>
	<li>The number of unique characters in the substring must be less than or equal to <code>maxLetters</code>.</li>
	<li>The substring size must be between <code>minSize</code> and <code>maxSize</code> inclusive.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
<strong>Output:</strong> 2
<strong>Explanation:</strong> Substring "aab" has 2 occurrences in the original string.
It satisfies the conditions, 2 unique letters and size 3 (between minSize and maxSize).
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> Substring "aaa" occur 2 times in the string. It can overlap.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= maxLetters &lt;= 26</code></li>
	<li><code>1 &lt;= minSize &lt;= maxSize &lt;= min(26, s.length)</code></li>
	<li><code>s</code> consists of only lowercase English letters.</li>
</ul>
</div>