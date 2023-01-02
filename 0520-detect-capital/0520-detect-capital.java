class Solution {
    public boolean detectCapitalUse(String word) {
         boolean first = false;
        int upper = 0, lower = 0;
        
        for(int i = 0; i < word.length() ; i++)
        {
            if(Character.isUpperCase(word.charAt(i)) && i == 0)
            {
                first = true;
                upper++;
            }
            else if(Character.isUpperCase(word.charAt(i)))
                upper++;
            else 
                lower++;
                
        }
        
        if(upper == word.length())
            return true;
        else if(lower == word.length())
            return true;
        else if(first == true && lower == word.length() - 1)
            return true;
        else 
            return false;
    }
}