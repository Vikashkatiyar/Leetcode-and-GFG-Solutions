class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int maxh=Math.max(horizontalCuts[0]-0,h-horizontalCuts[horizontalCuts.length-1]);
        for(int i=1;i<horizontalCuts.length;i++){
            int horizontalWidth=horizontalCuts[i]-horizontalCuts[i-1];
            maxh=Math.max(maxh,horizontalWidth);
        }

        
        
        
        int maxw=Math.max(verticalCuts[0]-0,w-verticalCuts[verticalCuts.length-1]);
        for(int i=1;i<verticalCuts.length;i++){
            int verticallWidth=verticalCuts[i]-verticalCuts[i-1];
            maxw=Math.max(maxw,verticallWidth);
        }
        
        
        long ans=1L*maxw*maxh;
        return (int)(ans%1000000007);
    }
}