class Solution {
    public int maxArea(int[] height) {
        int res=0;
        
        int left=0;
        int right=height.length-1;
        while(left<right){
          int area=Math.min(height[left],height[right])*(right-left);//height*width=area
            //(right-left)-> provides  the width of the area
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