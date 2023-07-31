class Solution {
    public String minimumString(String a, String b, String c) {
         ArrayList<String> ls = new ArrayList<>();

        // Get all possible superstrings using different permutations of 'a', 'b', and 'c'
        ls.add(shortestString(a, b, c));
        ls.add(shortestString(a, c, b));
        ls.add(shortestString(b, a, c));
        ls.add(shortestString(b, c, a));
        ls.add(shortestString(c, a, b));
        ls.add(shortestString(c, b, a));
        
        
        //Find the lexicographically smaller
        Collections.sort(ls, (p, q) -> {
            if (p.length() != q.length()) 
                return p.length() - q.length();
            else
                return p.compareTo(q);
        });

        return ls.get(0);
    }
    
    public String shortestString(String a, String b, String c)
    {
        
        String s = a.contains(b) ? a : mergeStrings(a, b);
        return s.contains(c) ? s : mergeStrings(s, c);
    }
    
    public static String mergeStrings(String a, String b) 
    {
        String commonCharacters = "";
        int minLength = Math.min(a.length(), b.length());

        // Find common characters at the end of string 'a' and the beginning of string 'b'
        for (int i = 1; i <= minLength; i++) 
        {
            if (a.substring(a.length() - i).equals(b.substring(0, i)))
                commonCharacters = a.substring(a.length() - i);
        }

        // Merge the strings by removing the common characters
        String mergedString = a + b.substring(commonCharacters.length());

        return mergedString;
    }
}