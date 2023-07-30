class Solution {
    //Jai Baba Bhole
    //O(n)
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        Set<Integer> set1=new HashSet<>();
        for(int num:nums){
            set1.add(num);
        }
        
        Set<Integer> set2=new HashSet<>();
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                set2.add(nums[j]);
                if(set1.size()==set2.size()){
                    count++;
                }
            }
            
            set2.clear();
        }
        
        return count;
    }
}