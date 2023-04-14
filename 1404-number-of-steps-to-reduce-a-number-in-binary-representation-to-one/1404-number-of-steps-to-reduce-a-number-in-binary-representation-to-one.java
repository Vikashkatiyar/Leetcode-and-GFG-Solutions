class Solution {
// Current Carry     |     CurrentBit         |      (Number of operations , Forward Carry)
//   0                        0                                [1,0]
//   0                        1                                [2,1]
//   1                        0                                [2,1]
//   1                        1                                [1,1]
    
    
    public int numSteps(String s) {
        int n=s.length();
        int carry=0;
        int steps=0;
        for(int i=n-1;i>=1;i--){
             char ch=s.charAt(i);
            
            if(carry==0){
                if(ch=='1'){
                    steps+=2;
                    carry=1;
                }else{
                    steps+=1;
                    carry=0;
                }
            }else{
                if(ch=='1'){
                    steps+=1;
                    carry=1;
                }else{
                    steps+=2;
                    carry=1;
                }
            }
        }
        return steps+carry;
       
    }
}