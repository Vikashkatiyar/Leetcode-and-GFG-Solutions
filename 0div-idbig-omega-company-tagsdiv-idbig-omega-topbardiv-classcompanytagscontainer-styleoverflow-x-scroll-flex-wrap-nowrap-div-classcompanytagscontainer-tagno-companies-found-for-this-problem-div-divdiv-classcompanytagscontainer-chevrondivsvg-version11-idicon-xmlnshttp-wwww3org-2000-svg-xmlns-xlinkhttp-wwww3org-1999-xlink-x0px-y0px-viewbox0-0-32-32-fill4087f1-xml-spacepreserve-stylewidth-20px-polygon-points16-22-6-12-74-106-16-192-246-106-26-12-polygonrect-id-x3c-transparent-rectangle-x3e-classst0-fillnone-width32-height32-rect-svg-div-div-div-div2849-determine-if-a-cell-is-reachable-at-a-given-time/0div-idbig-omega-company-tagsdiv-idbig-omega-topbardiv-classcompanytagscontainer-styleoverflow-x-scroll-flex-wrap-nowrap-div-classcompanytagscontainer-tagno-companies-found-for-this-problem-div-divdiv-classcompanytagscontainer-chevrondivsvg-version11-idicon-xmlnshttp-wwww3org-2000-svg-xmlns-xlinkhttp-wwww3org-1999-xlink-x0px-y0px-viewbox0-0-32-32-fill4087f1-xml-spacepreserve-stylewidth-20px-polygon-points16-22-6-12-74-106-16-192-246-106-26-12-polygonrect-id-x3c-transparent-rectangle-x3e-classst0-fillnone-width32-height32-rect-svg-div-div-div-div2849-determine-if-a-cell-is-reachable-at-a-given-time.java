class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int x_dir=Math.abs(fx-sx);
        int y_dir=Math.abs(fy-sy);
        int diagonalDist=Math.min(x_dir,y_dir);
        int afterDiagnalRestDist=Math.abs(y_dir-x_dir);
        
        if(x_dir==0 && y_dir==0){
            return t!=1;
        }
        
        return t>=diagonalDist+afterDiagnalRestDist;
    }
}