class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int fi=-1;
        int li=-1;
        
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                continue;
            }else if(fi==-1 && li==-1 && flowerbed[i]==1){
                fi=i;
                li=i;
            }else{
                li=i;
            }
        }
        
        if(fi==-1){
            return n<=(flowerbed.length+1)/2;
        }
        
        int max=fi/2;
        max+=(flowerbed.length-li-1)/2;
        
        int count=0;
        for(int i=fi+1;i<=li-1;i++){
            if(flowerbed[i]==0){
                count++;
            }else if(flowerbed[i]==1){
                max+=(count-1)/2;
                count=0;
            }
        }
        
        max+=(count-1)/2;
        
        return n<=max;
    }
}