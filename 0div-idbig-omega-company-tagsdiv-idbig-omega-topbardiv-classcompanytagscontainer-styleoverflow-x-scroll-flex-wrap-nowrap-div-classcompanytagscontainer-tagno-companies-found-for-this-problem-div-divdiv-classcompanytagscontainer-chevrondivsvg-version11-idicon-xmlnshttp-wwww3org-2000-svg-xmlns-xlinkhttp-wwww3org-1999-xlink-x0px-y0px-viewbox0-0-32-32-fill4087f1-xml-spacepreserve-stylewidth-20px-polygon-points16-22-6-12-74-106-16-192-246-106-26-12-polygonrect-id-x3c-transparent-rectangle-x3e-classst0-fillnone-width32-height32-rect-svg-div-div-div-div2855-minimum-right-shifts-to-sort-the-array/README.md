<h2><a href="https://leetcode.com/problems/minimum-right-shifts-to-sort-the-array/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2855. Minimum Right Shifts to Sort the Array</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed</strong> array <code>nums</code> of length <code>n</code> containing <strong>distinct</strong> positive integers. Return <em>the <strong>minimum</strong> number of <strong>right shifts</strong> required to sort </em><code>nums</code><em> and </em><code>-1</code><em> if this is not possible.</em></p>

<p>A <strong>right shift</strong> is defined as shifting the element at index <code>i</code> to index <code>(i + 1) % n</code>, for all indices.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [3,4,5,1,2]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
After the first right shift, nums = [2,3,4,5,1].
After the second right shift, nums = [1,2,3,4,5].
Now nums is sorted; therefore the answer is 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,3,5]
<strong>Output:</strong> 0
<strong>Explanation:</strong> nums is already sorted therefore, the answer is 0.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [2,1,4]
<strong>Output:</strong> -1
<strong>Explanation:</strong> It's impossible to sort the array using right shifts.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 100</code></li>
	<li><code>nums</code> contains distinct integers.</li>
</ul>
</div>