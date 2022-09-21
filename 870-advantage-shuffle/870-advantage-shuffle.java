class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<nums2.length;i++){
            pq.add(new int[]{nums2[i],i});
        }
        int left=0;
        int right=nums1.length-1;
        while(left<=right){
            int[] arr=pq.poll();
            int val=arr[0];
            int idx=arr[1];
            if(nums1[right]>val){
                nums2[idx]=nums1[right];
                right--;
            }else{
                nums2[idx]=nums1[left];
                left++;
            }
        }
        return nums2;
    }
}



//  int i=0;
//         int j=0;
//         while(i<nums1.length && j<nums2.length){
//             if(nums1[i]>nums2[j]){
//                 i++;
//                 j++;
//             }else{
//                 int k=i+1;
//                 while(k<j && k<nums1.length){
//                     k++;
//                 }
//                 if(nums1[k]>nums2[j]){
//                     int temp=nums1[k];
//                    nums1[k]=nums1[i];
//                    nums1[i]=temp;
//                 }
                
                
//                 i++;
//                 j++;
                
//             }
//         }
//         return nums1;