class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num:nums){
            if(map.containsKey(num)){
                count=num;
                
            }else{
                map.put(num,1);
            }
        }
        
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                return new int[]{count,i};
            }
        }
        return new int[]{};
    }
}