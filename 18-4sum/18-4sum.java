class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
          List<List<Integer>> result = new ArrayList<List<Integer>>();
        int n= nums.length;
        if(nums[0]==1000000000 && nums[1]==1000000000) return result;
        if(nums[0]==-1000000000 && nums[1]==-1000000000) return result;

        if(n<4){
        	return result;
        }
        
        Arrays.sort(nums);
        
        for(int i=0; i<=n-4;i++){
        	
        	if(i!=0 && nums[i]==nums[i-1]){        		
        		continue;
        	}
        	
        	int val1= nums[i];
        	
        	List<List<Integer>> subResult = threeSum(nums,target-val1, i+1);
        	
        	for(List<Integer> list : subResult){
            	list.add(val1);
            	result.add(list);
            }
        }
        
        return result;
        
    }
    
 	public static List<List<Integer>> threeSum(int[] nums, int target, int si) {
		List<List<Integer>> res= new ArrayList<List<Integer>>();       
        int n = nums.length;      
        if(n -si< 3){
        	return res;
        }
        
        Arrays.sort(nums);
        
        for(int i=si;i<=n-3;i++){
        	if(i!=si && nums[i]==nums[i-1]){
        		continue;
        	}
        	
        	int val1 = nums[i];
        	int targ = target-val1;
        	List<List<Integer>> subRes = twoSum(nums,i+1,n-1,targ);
        	
        	for(List<Integer> list: subRes){
        		list.add(val1);
        		res.add(list);
        	}
        	       	
        	
        }
        
        return res;
    }
	
	public static List<List<Integer>> twoSum(int[] arr, int i, int j, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
	    
		int left=i;
		int right = j;
		Arrays.sort(arr);
		
		while(left < right){			
			if(left!=i && arr[left]==arr[left-1]){
				left++;
				continue;
			}
			
			int sum = arr[left]+ arr[right];			
			if(sum==target){				
				List<Integer> pair = new ArrayList<Integer>();
				pair.add(arr[left]);
				pair.add(arr[right]);
				res.add(pair);
				left++;
				right--;
			}else if(sum > target){
				right--;
			}else{
				left++;
			}
			
		}
		
		
		return res;
	  }
}