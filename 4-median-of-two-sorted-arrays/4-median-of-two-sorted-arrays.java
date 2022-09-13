class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []merge=new int[nums1.length+nums2.length];
        
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                k++;
                i++;
            }else{
                merge[k]=nums2[j];
                k++;
                j++;
            }
        }
        
        while(i<nums1.length){
           merge[k]=nums1[i];
                k++;
                i++; 
        }
        
        while(j<nums2.length){
            merge[k]=nums2[j];
                k++;
                j++;
        }
        
        int mid=merge.length/2;
        double median=0.0;
        if(merge.length%2==0){
            median=(merge[mid]+merge[mid-1])/2.0;
        }else{
            median=merge[mid]/1.0;
        }
        return median;
    }
}