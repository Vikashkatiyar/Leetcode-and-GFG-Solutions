class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        
        for(int i=arr.length-1;i>=0;i--){
            int maxIdx=i;
            
            //Here Find the maxEle index number ==maxIdx
            for(int j=i-1;j>=0;j--){
                maxIdx=(arr[maxIdx]<arr[j])?j:maxIdx;
            }
            
            
            
            if(maxIdx!=i){
                reverse(arr,0,maxIdx); //first flip 0 to maxIdx(maxEle goes to first position)
                ans.add(maxIdx+1);
                
                
                reverse(arr,0,i); //Second Flip 0 to i (maxEle goes to right position)
                ans.add(i+1);
            }
            
        }
        return ans;
    }
    
    public void reverse(int []arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    
}