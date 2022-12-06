class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        for (String p : path.split("/")) {
            if (p.isEmpty() || ".".equals(p)) 
                continue;
            if ("..".equals(p)) {
                if (!s.isEmpty()) 
                    s.pop();
            } else 
                s.push(p);
        }
        return "/" + String.join("/", s);
    }
}