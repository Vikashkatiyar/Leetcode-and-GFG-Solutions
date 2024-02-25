class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            Set<Integer> temp=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int val=0-nums[i]-nums[j];
                
                if(temp.contains(val)){
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], val));
                    Collections.sort(list);
                    set.add(list);
                }
                temp.add(nums[j]);
            }
        }
        
         
        // List<List<Integer>> ans=new ArrayList<>();
        // for(List<Integer> list: set){
        //     ans.add(list);
        // }
        // return ans;
        
        return new ArrayList<>(set);
        
    }
    
    
}