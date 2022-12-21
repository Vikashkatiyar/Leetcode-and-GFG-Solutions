class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        int n=arr.length;    
        int rightSum=0;
        int leftSum=0;
        int[] ans=new int[arr.length];
        
        for(int num:arr){
            rightSum+=num;
        }
        
        for(int i=0;i<arr.length;i++){
            rightSum-=arr[i];
            ans[i]=(i*arr[i]-leftSum)+(rightSum-(n-1-i)*arr[i]);
            leftSum+=arr[i];
        }
        return ans;
    }
}