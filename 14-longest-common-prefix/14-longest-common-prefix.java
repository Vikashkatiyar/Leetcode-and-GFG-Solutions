class Solution {
    public static int minLength(String[] arr){
        int min=arr[0].length();
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()<min){
                min=arr[i].length();
            }
        }
        return min;
    }
    public String longestCommonPrefix(String[] str) {
        int minLen=minLength(str);
        String result="";
        char current;
        for(int i=0;i<minLen;i++){
            current=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(str[j].charAt(i)!=current){
                    return result;
                }
            }
            result+=current;
        }
        return result;
    }
}