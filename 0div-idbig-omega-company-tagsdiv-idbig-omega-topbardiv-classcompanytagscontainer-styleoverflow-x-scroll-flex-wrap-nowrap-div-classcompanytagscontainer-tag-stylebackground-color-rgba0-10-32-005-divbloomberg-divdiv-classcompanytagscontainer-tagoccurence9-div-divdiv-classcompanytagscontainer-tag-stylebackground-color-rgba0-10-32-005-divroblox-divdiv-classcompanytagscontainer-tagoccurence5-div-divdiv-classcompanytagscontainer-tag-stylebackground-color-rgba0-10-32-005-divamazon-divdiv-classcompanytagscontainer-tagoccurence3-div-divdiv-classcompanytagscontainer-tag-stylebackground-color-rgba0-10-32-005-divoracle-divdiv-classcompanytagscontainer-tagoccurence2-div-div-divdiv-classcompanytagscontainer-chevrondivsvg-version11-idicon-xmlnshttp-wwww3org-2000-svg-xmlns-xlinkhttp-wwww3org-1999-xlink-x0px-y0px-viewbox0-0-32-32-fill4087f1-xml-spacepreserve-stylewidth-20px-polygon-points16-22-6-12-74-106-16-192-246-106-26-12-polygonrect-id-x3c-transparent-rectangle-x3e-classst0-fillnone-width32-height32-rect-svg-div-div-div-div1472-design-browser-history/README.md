<h2><a href="https://leetcode.com/problems/design-browser-history/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Bloomberg</div><div class="companyTagsContainer--tagOccurence">9</div></div><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Roblox</div><div class="companyTagsContainer--tagOccurence">5</div></div><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Amazon</div><div class="companyTagsContainer--tagOccurence">3</div></div><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Oracle</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1472. Design Browser History</a></h2><h3>Medium</h3><hr><div><p>You have a <strong>browser</strong> of one tab where you start on the <code>homepage</code> and you can visit another <code>url</code>, get back in the history number of <code>steps</code> or move forward in the history number of <code>steps</code>.</p>

<p>Implement the <code>BrowserHistory</code> class:</p>

<ul>
	<li><code>BrowserHistory(string homepage)</code> Initializes the object with the <code>homepage</code>&nbsp;of the browser.</li>
	<li><code>void visit(string url)</code>&nbsp;Visits&nbsp;<code>url</code> from the current page. It clears up all the forward history.</li>
	<li><code>string back(int steps)</code>&nbsp;Move <code>steps</code> back in history. If you can only return <code>x</code> steps in the history and <code>steps &gt; x</code>, you will&nbsp;return only <code>x</code> steps. Return the current <code>url</code>&nbsp;after moving back in history <strong>at most</strong> <code>steps</code>.</li>
	<li><code>string forward(int steps)</code>&nbsp;Move <code>steps</code> forward in history. If you can only forward <code>x</code> steps in the history and <code>steps &gt; x</code>, you will&nbsp;forward only&nbsp;<code>x</code> steps. Return the current <code>url</code>&nbsp;after forwarding in history <strong>at most</strong> <code>steps</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre><b>Input:</b>
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
<b>Output:</b>
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]

<b>Explanation:</b>
BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= homepage.length &lt;= 20</code></li>
	<li><code>1 &lt;= url.length &lt;= 20</code></li>
	<li><code>1 &lt;= steps &lt;= 100</code></li>
	<li><code>homepage</code> and <code>url</code> consist of&nbsp; '.' or lower case English letters.</li>
	<li>At most <code>5000</code>&nbsp;calls will be made to <code>visit</code>, <code>back</code>, and <code>forward</code>.</li>
</ul>
</div>