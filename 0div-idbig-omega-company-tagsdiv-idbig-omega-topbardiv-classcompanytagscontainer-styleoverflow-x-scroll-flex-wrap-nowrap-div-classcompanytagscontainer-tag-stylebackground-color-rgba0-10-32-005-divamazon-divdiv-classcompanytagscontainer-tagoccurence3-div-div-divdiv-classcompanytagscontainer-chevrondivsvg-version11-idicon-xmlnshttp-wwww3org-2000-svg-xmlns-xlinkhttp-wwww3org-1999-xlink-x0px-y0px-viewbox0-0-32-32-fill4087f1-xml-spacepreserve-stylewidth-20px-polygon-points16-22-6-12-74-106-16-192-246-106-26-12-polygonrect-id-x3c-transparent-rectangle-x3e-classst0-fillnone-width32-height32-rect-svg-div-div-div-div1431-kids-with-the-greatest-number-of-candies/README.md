<h2><a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Amazon</div><div class="companyTagsContainer--tagOccurence">3</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1431. Kids With the Greatest Number of Candies</a></h2><h3>Easy</h3><hr><div><p>There are <code>n</code> kids with candies. You are given an integer array <code>candies</code>, where each <code>candies[i]</code> represents the number of candies the <code>i<sup>th</sup></code> kid has, and an integer <code>extraCandies</code>, denoting the number of extra candies that you have.</p>

<p>Return <em>a boolean array </em><code>result</code><em> of length </em><code>n</code><em>, where </em><code>result[i]</code><em> is </em><code>true</code><em> if, after giving the </em><code>i<sup>th</sup></code><em> kid all the </em><code>extraCandies</code><em>, they will have the <strong>greatest</strong> number of candies among all the kids</em><em>, or </em><code>false</code><em> otherwise</em>.</p>

<p>Note that <strong>multiple</strong> kids can have the <strong>greatest</strong> number of candies.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> candies = [2,3,5,1,3], extraCandies = 3
<strong>Output:</strong> [true,true,true,false,true] 
<strong>Explanation:</strong> If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> candies = [4,2,1,1,2], extraCandies = 1
<strong>Output:</strong> [true,false,false,false,false] 
<strong>Explanation:</strong> There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> candies = [12,1,12], extraCandies = 10
<strong>Output:</strong> [true,false,true]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == candies.length</code></li>
	<li><code>2 &lt;= n &lt;= 100</code></li>
	<li><code>1 &lt;= candies[i] &lt;= 100</code></li>
	<li><code>1 &lt;= extraCandies &lt;= 50</code></li>
</ul>
</div>