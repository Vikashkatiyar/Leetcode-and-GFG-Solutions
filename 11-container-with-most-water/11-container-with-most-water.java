class Solution {
    //TC:O(n)
    //SC:O(1)
    public int maxArea(int[] height) {
        int res=0;
        
        int left=0;
        int right=height.length-1;
        while(left<right){
          int area=Math.min(height[left],height[right])*(right-left);
            res=Math.max(area,res);
            
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}