class Solution {
    /*
      key->target
      
      1->100
      1->100
      max=2
      
      1->400
      max=1
      
      
      1->300
      max=1
      
      ans=100(max=2);
    */
    public int mostFrequent(int[] nums, int key) {
        int[] arr=new int[1001];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                arr[nums[i+1]]++;
            }
        }
        
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                ans=i;
            }
        }
        return ans;
    }
}