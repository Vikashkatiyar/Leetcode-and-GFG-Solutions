class Solution {
    
    
    
    int[][] dirs = {{2, 1}, {-2, 1}, {2, -1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
    
    public boolean isValid(int r,int c,int n){
        if(r>=0 && r<n && c>=0 && c<n){
            return true;
        }else {
            return false;
        }
    }
    public double knightProbability(int n, int step, int row, int column) {
        double [][] curr=new double[n][n];
        double [][] next=new double[n][n];
        curr[row][column]=1;
        
        for(int k=1;k<=step;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int[] dir:dirs){
                        int ni=i+dir[0];
                        int nj=j+dir[1];
                        
                        if(isValid(ni,nj,n)){
                            next[ni][nj]+=curr[i][j]/8.0;
                        }
                    }
                }
            }
            curr=next;
            next=new double[n][n];
        }
        
        double res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res+=curr[i][j];
            }
        }
        return res;
    }
}