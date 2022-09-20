class Pair{
        int i;
        int val;
        int sum;
        public Pair(int i,int val,int sum){
            this.i=i;
            this.val=val;
            this.sum=sum;
        }
    }
class Solution {
    
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int size=getSize(nums);
        
        Pair[] arr=new Pair[size];
        int idx=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                Pair temp=new Pair(i,nums.get(i).get(j),i+j);
                arr[idx++]=temp;
            }
        }
        
        Arrays.sort(arr,(a,b)->{
                   if(a.sum!=b.sum) return a.sum-b.sum;
                    return b.i-a.i;
        });
        
        int[] ans=new int[size];
        int i=0;
        for(Pair a:arr){
            ans[i++]=a.val;
        }
        return ans;
    }
    
    public int getSize(List<List<Integer>> nums){
        int size=0;
        for(List<Integer> val:nums){
            size+=val.size();
        }
        return size;
    }
}