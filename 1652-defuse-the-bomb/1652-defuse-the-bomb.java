class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int len=code.length;
        int arr[]=new int[len];
        if(k==0)
            return arr;
        if(k>0)
        for(int i=0;i<len;i++)
        {
            int sum=0;
            for(int j=1;j<=k;j++)
            {
                sum+=code[(j+i)%len];
            }
            arr[i]=sum;
        }
        if(k<0)
        {
           
            for(int i=0;i<code.length;i++)
            {
                int sum=0;
                for(int j=1;j<=-1*k;j++)
                {
                    sum+=code[(len-j+i)%len];
                }
                arr[i]=sum;
            }
        }
        return arr;
    }
}