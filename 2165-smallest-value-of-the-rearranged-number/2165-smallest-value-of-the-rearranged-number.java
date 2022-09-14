class Solution {
    public long smallestNumber(long num) {
        boolean isNegative=(num<0);
        
        num=Math.abs(num);
        char[] arr=(num+"").toCharArray();
        
        Arrays.sort(arr);
        long ans=0;
        if(isNegative){ //when number is negative
            String ansStr="";
            for(int i=arr.length-1;i>=0;i--){
                ansStr+=arr[i];
            }
            ans=-Long.parseLong(ansStr);
        }else{// when number is non negative
            int i=0;
            while(i<arr.length){
                if(arr[i]!='0')
                    break;
                i++;
            }
            
            //swapping
            if(i<arr.length){
                char temp=arr[i];
                arr[i]=arr[0];
                arr[0]=temp;
            }
            
            
            String res=String.valueOf(arr);
            ans=Long.parseLong(res);
        }
        return ans;
    }
}