class Solution {
    public int getWinner(int[] arr, int k) {
        int left=0;
        int right=1;
        int t=k;
        while(right<arr.length){
            if(arr[left]>arr[right]){
                right++;
                k--;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                k=t;//reinitialize the variable
            }
            
            if(k==0){
                return arr[left];
            }
        }
        return arr[left];
    }
}