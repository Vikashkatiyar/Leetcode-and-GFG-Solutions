class Solution {
    //LC-75
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        
        for(int i=arr.length-1;i>=0;i--){
            
            if(!arr[i].isEmpty())
               sb.append(arr[i]+" ");
            
        }
        
        return sb.toString().trim();
    }
}