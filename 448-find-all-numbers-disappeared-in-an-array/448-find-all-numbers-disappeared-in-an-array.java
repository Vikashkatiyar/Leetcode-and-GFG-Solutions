class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr=new int[nums.length+1];
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        
        for(int i=1;i<nums.length+1;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}