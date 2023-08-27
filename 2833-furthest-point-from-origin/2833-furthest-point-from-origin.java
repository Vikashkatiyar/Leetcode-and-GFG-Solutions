class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int diff=0;
        int space=0;
        for(char ch: moves.toCharArray()){
            if(ch=='_'){
                space++;
            }else{
                diff+= ch=='L'?1:-1;
            }
        }
        
        return Math.abs(diff)+space;
    }
}