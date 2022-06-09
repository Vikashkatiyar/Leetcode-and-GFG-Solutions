
// TC:O(NlogN)+O(N){sorting+traversing whole array}
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return res.toArray(new int[0][]);
        }
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);//Tc:O(NlogN)
        
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        for(int []i:intervals){
            if(i[0]<=end){
                end=Math.max(i[1],end);
            }
            else{
                res.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}