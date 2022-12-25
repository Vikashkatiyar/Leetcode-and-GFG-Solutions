class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
         Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int sum=0;
            int j;
            for(j=0;j<nums.length;j++){
                if(sum+nums[j]>queries[i])
                    break;
            }
            list.add(j);
        }
        int []arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}