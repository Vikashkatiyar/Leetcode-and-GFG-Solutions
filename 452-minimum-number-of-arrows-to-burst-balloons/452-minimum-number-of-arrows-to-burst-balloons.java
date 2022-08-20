class Solution {
    //O(nlogn)
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->{
            if(a[0]>b[0])
                return +1;
            else if(a[0]==b[0])
                return 0;
            else
                return -1;
        });
        
        int count=1;
        int end=points[0][1];
        for(int i=1;i<points.length;i++){
            int []p=points[i];
            if(p[0]>end){
                count++;
                end=p[1];
            }else{
                end=Math.min(p[1],end);
            }
        }
        return count;
    }
}