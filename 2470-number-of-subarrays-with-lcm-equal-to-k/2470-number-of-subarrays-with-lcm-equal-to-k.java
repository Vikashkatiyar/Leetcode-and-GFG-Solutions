class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int currLcm=1;
            for(int j=i;j<nums.length;j++){
                currLcm=lcm(currLcm,nums[j]);
                if(currLcm==k){
                    res+=1;
                }
            }
        }
        return res;
    }
    
    public int lcm(int a,int b){
      return (a*b)/gcd(a,b);
    }
    
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}