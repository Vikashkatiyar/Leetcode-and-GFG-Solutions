class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int []arr=new int[nums.length+1];
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        
        }
        
        for(int i=1;i<nums.length+1;i++){
                if(arr[i]==2){
                    list.add(i);
                }
        }
        return list;
    }
}