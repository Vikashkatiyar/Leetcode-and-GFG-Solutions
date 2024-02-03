class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[0]+nums[2]<=nums[1]){
            //"none" if it cannot form a triangle.
            return "none";
            
        }else if (nums[0] == nums[1] && nums[1] == nums[2]){
            //equilateral if it has all sides of equal length.
            return "equilateral";

        }else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[2]==nums[0]){
            //isosceles if it has exactly two sides of equal length.
            return "isosceles";

        }
        else {
            //scalene if all its sides are of different lengths.
              return "scalene";

        }
    }
}