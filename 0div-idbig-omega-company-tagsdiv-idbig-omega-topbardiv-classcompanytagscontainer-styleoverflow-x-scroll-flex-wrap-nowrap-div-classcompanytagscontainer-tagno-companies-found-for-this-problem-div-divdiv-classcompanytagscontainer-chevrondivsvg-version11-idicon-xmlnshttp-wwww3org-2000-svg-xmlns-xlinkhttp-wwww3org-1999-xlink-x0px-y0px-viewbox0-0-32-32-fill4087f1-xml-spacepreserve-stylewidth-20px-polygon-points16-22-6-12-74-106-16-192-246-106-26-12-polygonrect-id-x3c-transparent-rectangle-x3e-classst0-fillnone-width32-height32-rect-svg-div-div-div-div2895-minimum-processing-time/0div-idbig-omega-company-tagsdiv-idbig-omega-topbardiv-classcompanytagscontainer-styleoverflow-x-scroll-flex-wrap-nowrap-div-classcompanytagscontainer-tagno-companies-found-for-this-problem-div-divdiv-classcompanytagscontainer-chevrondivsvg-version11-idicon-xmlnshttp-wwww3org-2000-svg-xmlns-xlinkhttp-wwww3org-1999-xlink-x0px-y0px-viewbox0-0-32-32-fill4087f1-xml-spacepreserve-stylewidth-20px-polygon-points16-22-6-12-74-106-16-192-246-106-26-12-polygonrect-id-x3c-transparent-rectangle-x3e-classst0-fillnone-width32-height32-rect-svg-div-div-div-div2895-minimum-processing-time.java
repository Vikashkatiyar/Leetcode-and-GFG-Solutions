class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks, Collections.reverseOrder()); 
        
        int i=0,j=0;
        int ans=0;
        while(j<tasks.size()){
            ans=Math.max(ans, processorTime.get(i)+tasks.get(j));
            i+=1;
            j+=4;
        }
        return ans;
    }
}