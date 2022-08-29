class Solution {
    //TC:O(nlog(n))
    int []res;
    class Pair{
        int idx;
        int val;
        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        Pair[] pairs=new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            pairs[i]=new Pair(i,nums[i]);
        }
        
        res=new int[pairs.length];
        mergeSort(pairs,0,pairs.length-1);
        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int val:res){
            ans.add(val);
        }
        return ans;
    }
    Pair[] mergeSort(Pair[] pairs,int lo,int hi){
        if(lo==hi){
            Pair[] ba=new Pair[1];
            ba[0]=new Pair(lo,pairs[lo].val);
            return ba;
        }
        int mid=(lo+hi)/2;
        Pair[] fh=mergeSort(pairs,lo,mid);
        Pair[] sh=mergeSort(pairs,mid+1,hi);
        Pair[] sarr=merge2(fh,sh);
        
        return sarr;
    }
    public Pair[] merge2(Pair[] fh,Pair[] sh){
        Pair[] ret=new Pair[fh.length+sh.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<fh.length && j<sh.length){
            if(fh[i].val> sh[j].val){
                 ret[k]=fh[i];
                res[fh[i].idx]+=(sh.length-j);
                k++;
                i++;
            }else{
                 ret[k]=sh[j];
                j++;
                k++;
            }
        }
        
        while(i<fh.length){
            ret[k]=fh[i];
            k++;
            i++;
        }
        
        while(j<sh.length){
            ret[k]=sh[j];
            j++;
            k++;
            
        }
        return ret;
    }
    
    
}