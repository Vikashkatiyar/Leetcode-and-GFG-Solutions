class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
         int freq=-1;
        int minEle=Integer.MAX_VALUE;
        for(int ele:nums){
            
            if(ele%2==0){
                map.put(ele,map.getOrDefault(ele,0)+1);
                if(map.get(ele)>freq){
                            freq=Math.max(freq,map.get(ele));
                            minEle=ele;
                }else if(map.get(ele)==freq && minEle>ele){
                            minEle=ele;
                }
            }
            
            
        }
        return minEle==Integer.MAX_VALUE?-1:minEle;
    }
}