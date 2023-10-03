<h2><a href="https://leetcode.com/problems/delete-leaves-with-a-given-value/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Amazon</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1325. Delete Leaves With a Given Value</a></h2><h3>Medium</h3><hr><div><p>Given a binary tree <code>root</code> and an integer <code>target</code>, delete all the <strong>leaf nodes</strong> with value <code>target</code>.</p>

<p>Note that once you delete a leaf node with value <code>target</code><strong>, </strong>if its parent node becomes a leaf node and has the value <code>target</code>, it should also be deleted (you need to continue doing that until you cannot).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2020/01/09/sample_1_1684.png" style="width: 500px; height: 112px;"></strong></p>

<pre><strong>Input:</strong> root = [1,2,3,2,null,2,4], target = 2
<strong>Output:</strong> [1,null,3,null,4]
<strong>Explanation:</strong> Leaf nodes in green with value (target = 2) are removed (Picture in left). 
After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).
</pre>

<p><strong class="example">Example 2:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2020/01/09/sample_2_1684.png" style="width: 400px; height: 154px;"></strong></p>

<pre><strong>Input:</strong> root = [1,3,3,3,2], target = 3
<strong>Output:</strong> [1,3,null,null,2]
</pre>

<p><strong class="example">Example 3:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2020/01/15/sample_3_1684.png" style="width: 500px; height: 166px;"></strong></p>

<pre><strong>Input:</strong> root = [1,2,null,2,null,2], target = 2
<strong>Output:</strong> [1]
<strong>Explanation:</strong> Leaf nodes in green with value (target = 2) are removed at each step.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 3000]</code>.</li>
	<li><code>1 &lt;= Node.val, target &lt;= 1000</code></li>
</ul>
</div>