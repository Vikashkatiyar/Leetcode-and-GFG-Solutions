class Solution {
    //Jai Baba Bhole
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int [] res=new int[n];
        int [] freq=new int[n+1];
        int curr=0;
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                curr++;
            }
            
            freq[B[i]]++;
            if(freq[B[i]]==2){
                curr++;
            }
            
            res[i]=curr;
            
        }
        return res;
    }
}