class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int task:tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        int count=0;
        for(int val:map.values()){
            if(val==1){
                return -1;
            }
            count+=val/3;
            if(val%3!=0){
                count++;
            }
            
        }
        return count;
    }
}