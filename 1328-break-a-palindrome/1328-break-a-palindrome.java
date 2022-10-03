class Solution {
    public String breakPalindrome(String str) {
        if(str.length()<=1){
            return "";
        }
        
        char []arr=str.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            //aabaa handled by arr.length/2 it will not go to the middle element of the array
            if(arr[i]!='a'){
                arr[i]='a';
                return String.valueOf(arr);
            }
        }
        
        arr[arr.length-1]='b';
        return String.valueOf(arr);
        
    }
}