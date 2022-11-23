class Solution {
    public String longestCommonPrefix(String[] str) {
        int minLen=minlengthOfString(str);
        String res="";
        char curr;
        for(int i=0;i<minLen;i++){
            curr=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(curr!=str[j].charAt(i)){
                    return res;
                }
            }
            res+=curr;
        }
        return res;
    }
    
    public int minlengthOfString(String[] arr){
        int min=arr[0].length();
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i].length());
        }
        return min;
    }
}