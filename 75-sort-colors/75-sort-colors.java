// dutch national flag algo:-
class Solution {
    private void swap(int i,int j,int []arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(high,mid,nums);
                high--;
                
            }
            else{
                mid++;
            }
        }
    }
}