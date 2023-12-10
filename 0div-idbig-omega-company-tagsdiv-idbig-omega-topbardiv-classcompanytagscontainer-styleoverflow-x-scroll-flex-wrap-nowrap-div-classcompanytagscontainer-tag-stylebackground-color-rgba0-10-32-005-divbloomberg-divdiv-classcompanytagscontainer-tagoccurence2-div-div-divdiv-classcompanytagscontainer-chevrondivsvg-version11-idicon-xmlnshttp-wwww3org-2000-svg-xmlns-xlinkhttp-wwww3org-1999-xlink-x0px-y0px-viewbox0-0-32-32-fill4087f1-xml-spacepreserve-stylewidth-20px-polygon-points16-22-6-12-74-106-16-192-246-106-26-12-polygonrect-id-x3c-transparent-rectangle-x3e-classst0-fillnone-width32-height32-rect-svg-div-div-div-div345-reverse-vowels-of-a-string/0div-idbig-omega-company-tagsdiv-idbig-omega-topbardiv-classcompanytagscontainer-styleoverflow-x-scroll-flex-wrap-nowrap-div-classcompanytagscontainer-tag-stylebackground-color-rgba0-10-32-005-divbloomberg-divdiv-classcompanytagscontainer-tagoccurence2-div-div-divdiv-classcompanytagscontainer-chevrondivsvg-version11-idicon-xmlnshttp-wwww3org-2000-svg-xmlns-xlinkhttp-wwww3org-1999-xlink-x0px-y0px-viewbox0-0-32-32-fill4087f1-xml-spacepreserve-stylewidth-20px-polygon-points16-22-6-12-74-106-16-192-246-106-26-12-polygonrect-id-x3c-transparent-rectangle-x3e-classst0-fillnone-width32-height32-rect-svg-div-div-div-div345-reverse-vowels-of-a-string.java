class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<=right){
            if(isVowel(arr[left]) && isVowel(arr[right])){
                char temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                
                left++;
                right--;
            }
            else if(isVowel(arr[left])){
                right--;
            }else if(isVowel(arr[right])){
                left++;
            }else{
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }
    
    public boolean isVowel(char ch){
        if(ch =='a' || ch =='e' ||ch=='i' || ch=='o'||ch=='u' || ch=='A' || ch=='E' ||ch=='I' || ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}