class Solution {
    //Jai Baba Bhole
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        Map<Integer,Pair> map=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map.put(mat[i][j],new Pair(i,j));
            }
        }
        
        int[] a=new int[m];
        int []b=new int[n];
        
        for(int i=0;i<arr.length;i++){
            Pair rem=map.get(arr[i]);
            int x=rem.i;
            int y=rem.j;
            
            a[x]++;
            b[y]++;
            
            if(a[x]==n || b[y]==m){
                return i;
            }
        }
        return arr.length-1;
    }
}