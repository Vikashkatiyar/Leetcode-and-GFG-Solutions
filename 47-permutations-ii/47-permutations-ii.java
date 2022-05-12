class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res=new HashSet();
        permute(nums,0,res);
        return new ArrayList(res);
    }
    
    public void permute(int []nums,int st,Set<List<Integer>> res){
        if(st==nums.length){
              res.add(arrayToList(nums));
        }
        
        for(int i=st;i<nums.length;i++){
           swap(nums,i,st);
            permute(nums,st+1,res);
            swap(nums,i,st);
        }
    }
    
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    private List<Integer> arrayToList(int []nums){
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        return list;
    }
}