class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int pLidx=0;
        int mLidx=0;
        int gLidx=0;
        int totalTime=0;
        
        for(int i=0;i<garbage.length;i++){
            for(char ch:garbage[i].toCharArray()){
                if(ch=='P'){
                    pLidx=i;
                }else if(ch=='M'){
                    mLidx=i;
                }else if(ch=='G'){
                    gLidx=i;
                }
            }
            totalTime+=garbage[i].toCharArray().length;
        }
        
        
        for(int i=1;i<travel.length;i++){
            travel[i]=travel[i]+travel[i-1];
        }
        
        totalTime+=pLidx==0?0:travel[pLidx-1];
        totalTime+=mLidx==0?0:travel[mLidx-1];
        totalTime+=gLidx==0?0:travel[gLidx-1];
         return totalTime;
    }
}