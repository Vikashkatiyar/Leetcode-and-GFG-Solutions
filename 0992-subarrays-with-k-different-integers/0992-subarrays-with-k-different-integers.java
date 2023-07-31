class Solution {
    //Jai Baba Bhole 
    //o(n)
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithKSize(nums,k)-subarraysWithKSize(nums,k-1);
    }
    
    public int subarraysWithKSize(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        int count=0;
        int j=0;
        int i=0;
        
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
            while(map.size()==k+1) {
                
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
                
            }
            
            count+=j-i+1;
            j++;
        }
        
        return count;
    }
}