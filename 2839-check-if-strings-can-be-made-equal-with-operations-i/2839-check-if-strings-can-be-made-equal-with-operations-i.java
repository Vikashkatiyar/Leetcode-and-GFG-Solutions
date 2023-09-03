class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        
        for(int i=0;i<=1;i++){
            if(s1.equals(s2)){
                 return true;
            }else if(s1.charAt(i)!=s2.charAt(i)){
                char arr[]=s1.toCharArray();
                char temp=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=temp;
                s1=String.valueOf(arr);
            }
        }
        if(s1.equals(s2)){
                 return true;
        }
        
        return false;
    }
}