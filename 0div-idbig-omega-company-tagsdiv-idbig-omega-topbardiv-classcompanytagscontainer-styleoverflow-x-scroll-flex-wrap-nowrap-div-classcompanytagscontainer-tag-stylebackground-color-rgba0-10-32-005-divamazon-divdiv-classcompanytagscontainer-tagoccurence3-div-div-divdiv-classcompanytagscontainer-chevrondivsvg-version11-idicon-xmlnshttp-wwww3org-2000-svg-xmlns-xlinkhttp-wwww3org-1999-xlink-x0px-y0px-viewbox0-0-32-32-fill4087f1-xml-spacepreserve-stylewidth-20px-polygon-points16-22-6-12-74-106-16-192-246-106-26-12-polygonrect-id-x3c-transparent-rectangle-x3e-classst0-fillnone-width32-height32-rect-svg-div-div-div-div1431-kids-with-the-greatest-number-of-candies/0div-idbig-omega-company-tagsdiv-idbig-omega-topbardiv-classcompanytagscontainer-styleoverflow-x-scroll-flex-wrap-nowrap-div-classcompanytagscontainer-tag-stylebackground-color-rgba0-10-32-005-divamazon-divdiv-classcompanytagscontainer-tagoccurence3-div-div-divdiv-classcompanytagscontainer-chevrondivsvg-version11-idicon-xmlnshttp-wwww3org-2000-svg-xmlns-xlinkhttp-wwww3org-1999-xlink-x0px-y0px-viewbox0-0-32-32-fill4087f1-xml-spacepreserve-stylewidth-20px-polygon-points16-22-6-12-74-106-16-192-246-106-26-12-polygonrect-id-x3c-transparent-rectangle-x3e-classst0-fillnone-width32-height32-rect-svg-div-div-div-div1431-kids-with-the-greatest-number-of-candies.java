class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int maxCandy=0;
        for(int candy: candies){
            maxCandy=Math.max(candy,maxCandy);
        }
        
        for(int candy: candies){
            if(candy+extraCandies >= maxCandy){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        
        return list;
    }
}